package com.septinary.xb.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.septinary.xb.domain.SysUser;
import com.septinary.xb.service.SysUserService;


@Controller
@RequestMapping("/sysUser")
public class SysUserController {

	@Autowired
	private SysUserService sysUserService;
	

	public void setSysUserService(SysUserService sysUserService) {
		this.sysUserService = sysUserService;
	}


	@RequestMapping("/select/{id}")
	public String showUser(@PathVariable Integer id, HttpServletRequest request) {
		System.out.println("id = " + id);
		/*SysUser sysUser = new SysUser();
		sysUser.setId(1);
		sysUser.setName("huangxiaoqing");
		sysUser.setAge(89);
		sysUser.setRemark("test122");*/
		//sysUserService.update(sysUser);
		//SysUser sysUser = sysUserService.fetch(1);
		List<SysUser> sysUserList = sysUserService.findAll();
		for ( SysUser sysUser : sysUserList ){
			System.out.println("------" + sysUser.getName());
		}
		
		SysUser sysUser = sysUserService.fetch(id);
		System.out.println("--dfad----" + sysUser.getRemark());
		
		
		return "select";
	}
	
	@RequestMapping(value = "/qcode_query", method = RequestMethod.GET)
	@ResponseBody
	public HashMap<String, Object> qcode_activity(String group_id) {
		return null;
		
	}

}
