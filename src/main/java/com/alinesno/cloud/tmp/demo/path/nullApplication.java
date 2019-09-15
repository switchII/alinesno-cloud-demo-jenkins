package com.alinesno.cloud.tmp.demo.path;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import com.alinesno.cloud.common.web.enable.EnableAlinesnoCommonLogin;

/**
 * 启动入口<br/>
 * @EnableSwagger2 //开启swagger2 
 * 
 * @author ${author} 
 * @sine 2019-09-15 20:09:288
 */
@EnableJpaAuditing // jpa注解支持
@EnableAsync // 开启异步任务
@EnableEurekaClient  // 开启eureka
@SpringBootApplication
@EnableAlinesnoCommonLogin
public class AlinesnoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlinesnoApplication.class, args);
	}

}
