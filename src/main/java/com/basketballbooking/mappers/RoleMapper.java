package com.basketballbooking.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.basketballbooking.models.RoleModel;

@Mapper
public interface RoleMapper {
	
	@Select("Select id as id, roleName as roleName " +
			"FROM Role"
	)
	List<RoleModel> getRoleLst();
}
