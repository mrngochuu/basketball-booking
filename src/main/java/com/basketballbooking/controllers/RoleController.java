package com.basketballbooking.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.basketballbooking.models.RoleModel;
import com.basketballbooking.services.IRoleService;

@RestController
@RequestMapping(value = "/home")
public class RoleController {
	
	@Autowired
	private IRoleService roleService;
	
	@RequestMapping(value = "/role", method = RequestMethod.GET)
	public List<RoleModel> roleController() {
		return roleService.getRole();
	}
}
