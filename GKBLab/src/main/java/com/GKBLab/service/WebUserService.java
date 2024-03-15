package com.GKBLab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.GKBLab.dao.WebUserDao;
import com.GKBLab.dto.WebUser;

@Component
public class WebUserService {
	
	
	@Autowired
	WebUserDao dao;
	
	public WebUser save(WebUser user) {
		return dao.save(user);
	}
	
	public List<WebUser> getAll(){
		return dao.getAll();
	}

}
