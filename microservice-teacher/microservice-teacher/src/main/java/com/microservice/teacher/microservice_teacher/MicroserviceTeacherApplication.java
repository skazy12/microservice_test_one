package com.microservice.teacher.microservice_teacher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class MicroserviceTeacherApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceTeacherApplication.class, args);
	}

}
