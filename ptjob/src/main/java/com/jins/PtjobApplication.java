
package com.jins;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@SpringBootApplication
@ComponentScan
@MapperScan(basePackages = "com.jins.dao")
public class PtjobApplication extends WebMvcConfigurationSupport {
	public static void main(String[] args) {
		SpringApplication.run(PtjobApplication.class, args);
	}

	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
		super.addResourceHandlers(registry);
	}

//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		return builder.sources(PtjobApplication.class); ResourceUtils.CLASSPATH_URL_PREFIX + "/static/"
//	} "classpath:/static/"

}
