package com.asiainfo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

import com.asiainfo.entity.Product;
/**
 * 可以在每一个Mapper接口上面添加@Mapper从而告诉spb该接口的实现类（当然是代理出来的）被Spring托管，
 * 还有一种简化的方式就是在启动类加上@MapperScan(basePackages = {"com.asiainfo.mapper"})，这样所配置目录下的Mapper接口就不需要在添加@Mapper注解了
 */
@Mapper
public interface ProductMapper {
	Product getProductById(Long id);
}
