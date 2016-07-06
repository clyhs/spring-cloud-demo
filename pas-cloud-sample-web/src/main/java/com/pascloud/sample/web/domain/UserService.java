/**
 * 
 */
package com.pascloud.sample.web.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.pascloud.sample.web.model.User;

/**
 * @author chenly
 * 
 * @version createtime:2016-7-6 下午2:57:25
 */
@Service
public class UserService {

	@Autowired
	RestTemplate restTemplate;

	final String SERVICE_NAME = "pascloud-simple-service";

	@HystrixCommand(fallbackMethod = "fallbackSearchAll")
	public List<User> readUserInfo() {
		return restTemplate.getForObject("http://" + SERVICE_NAME + "/user",
				List.class);
	}

	private List<User> fallbackSearchAll() {
		System.out.println("HystrixCommand fallbackMethod handle!");
		List<User> ls = new ArrayList<User>();
		User user = new User();
		user.setName("TestHystrixCommand");
		ls.add(user);
		return ls;
	}

}
