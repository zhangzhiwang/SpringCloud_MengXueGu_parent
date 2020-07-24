package com.asiainfo.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "mybatis")
@Component
public class TestProperties {
	private String typeAliasesPackage;

	public String getTypeAliasesPackage() {
		return typeAliasesPackage;
	}

	public void setTypeAliasesPackage(String typeAliasesPackage) {
		this.typeAliasesPackage = typeAliasesPackage;
	}

	@Override
	public String toString() {
		return "TestProperties [typeAliasesPackage=" + typeAliasesPackage + "]";
	}
	
}
