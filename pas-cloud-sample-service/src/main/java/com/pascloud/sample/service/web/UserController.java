/**
 * 
 */
package com.pascloud.sample.service.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pascloud.sample.service.domain.UserService;
import com.pascloud.sample.service.model.User;

/**
 * @author chenly 
 *
 * @version createtime:2016-7-6 下午2:41:13 
 */
@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value="/user",method=RequestMethod.GET)
	public List<User> readUserInfo(){
		List<User> ls=userService.searchAll();		
		return ls;
	}
}
