/**
 * 
 */
package com.pascloud.sample.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author chenly 
 *
 * @version createtime:2016-7-6 上午11:50:31 
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Application {
	
	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
