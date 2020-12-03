package com.basketballbooking.components;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.basketballbooking.mappers.RoleMapper;
import com.basketballbooking.models.RoleModel;

@Component
public class RoleComponentImp implements IRoleComponent{

	@Autowired
	private RoleMapper roleMapper;
	
	@Override
	public List<RoleModel> getRole() {
		return roleMapper.getRoleLst();
	}
	
}
