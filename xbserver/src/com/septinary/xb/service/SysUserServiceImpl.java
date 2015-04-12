package com.septinary.xb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.septinary.xb.core.crud.BaseMapper;
import com.septinary.xb.core.crud.BaseServiceImpl;
import com.septinary.xb.domain.SysUser;
import com.septinary.xb.mapper.SysUserMapper;


@Service("sysUserService")
public class SysUserServiceImpl extends BaseServiceImpl<SysUser, Integer> implements SysUserService{

	@Autowired
	private SysUserMapper sysUserMapper;

	public void setSysUserMapper(SysUserMapper sysUserMapper) {
		this.sysUserMapper = sysUserMapper;
	}

	@Override
	public BaseMapper<SysUser, Integer> getBaseMapper() {
		return sysUserMapper;
	}
	
}
