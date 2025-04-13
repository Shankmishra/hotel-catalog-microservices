package com.Mic.Hotelcatalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
@EnableHystrixDashboard
public class HotelCatalogServiceApplication {
 
	   
	@Bean           
	@LoadBalanced
	public RestTemplate getTemp() { 
		/* 
		 * HttpComponentsClientHttpRequestFactory Rf = new 
		 * HttpComponentsClientHttpRequestFactory(); Rf.setConnectTimeout(3000);
		 */
		return new RestTemplate();              
	}   
	public static void main(String[] args) {  
		SpringApplication.run(HotelCatalogServiceApplication.class, args);
	}
  
}
 