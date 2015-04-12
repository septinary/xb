package com.septinary.xb.mapper;


import org.apache.ibatis.annotations.CacheNamespace;

import com.septinary.xb.core.cache.MybatisRedisCache;
import com.septinary.xb.core.crud.BaseMapper;
import com.septinary.xb.domain.SysUser;


//@CacheNamespace(implementation=MybatisRedisCache.class )

public interface SysUserMapper extends BaseMapper<SysUser, Integer>{
	
}
