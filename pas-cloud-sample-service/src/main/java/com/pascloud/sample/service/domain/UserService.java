/**
 * 
 */
package com.pascloud.sample.service.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pascloud.sample.service.model.User;

/**
 * @author chenly 
 *
 * @version createtime:2016-7-6 下午2:36:25 
 */
@Service
public class UserService {
	
	public List<User> searchAll(){
		List<User> list = new ArrayList<User>();
		for(int i=0;i<3;i++){
			User u = new User();
			u.setId(i);
			u.setName("name-"+i);
			list.add(u);
		}
		
		return list;
	}

}
