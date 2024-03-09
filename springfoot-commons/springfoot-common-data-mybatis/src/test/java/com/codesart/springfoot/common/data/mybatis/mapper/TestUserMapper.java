package com.codesart.springfoot.common.data.mybatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.codesart.springfoot.common.data.mybatis.entity.TestUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestUserMapper extends BaseMapper<TestUser> {

}
