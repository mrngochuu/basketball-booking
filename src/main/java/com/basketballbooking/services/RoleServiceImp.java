package com.basketballbooking.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basketballbooking.components.IRoleComponent;
import com.basketballbooking.models.RoleModel;

@Service
public class RoleServiceImp implements IRoleService {

	@Autowired
	private IRoleComponent roleComponent;
	
	@Override
	public List<RoleModel> getRole() {
		return roleComponent.getRole();
	}
	
}
