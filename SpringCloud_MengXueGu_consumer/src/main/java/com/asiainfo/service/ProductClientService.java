package com.asiainfo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.asiainfo.entity.Product;
import com.asiainfo.fallback.ProductClientServiceFallback;

/**
 * 1、标明使用feign客户端，value的值是要调用的提供者的应用名称，也就是提供者的spring.application.name的值
 * 2、feign内置了hystrix断路器，所以如果引入了feign的依赖就无需显示地引入hystrix依赖。
 * 3、通过feign客户端使用hystrix的方法：
 * 	（1）在@FeignClient注解中使用属性fallback来定义Fallback类，如本例的ProductClientServiceFallback
 * 	（2）定义的Fallback类必须实现被熔断的接口，如本例的ProductClientService
 * 	（3）该Fallback类必须声明被Spring托管，比如加注解@Component，否则报错
 * 	（4）在配置文件中开启hystrix：feign.hystrix.enabled=true
 * 
 * 测试客户端熔断的方法很简单，把服务提供者停掉就可以了。
 */
@FeignClient(value = "spring-cloud-provider", fallback = ProductClientServiceFallback.class)
public interface ProductClientService {
	/**
	 * SpringCloud对Feign进行了增强兼容了SpringMVC的注解 ，我们在使用SpringMVC的注解时需要注意: 
	 * 1、@FeignClient接口方法有基本类型参数在参数必须加@PathVariable("XXX") 或 @RequestParam("XXX") 
	 * 2、@FeignClient接口方法返回值为复杂对象时，此类型必须有无参构造方法。
	 */
	@GetMapping("productController/product/{id}")// 通过http调用目标服务的url
	Product queryProductByIdFeign(@PathVariable("id") long id);
}
