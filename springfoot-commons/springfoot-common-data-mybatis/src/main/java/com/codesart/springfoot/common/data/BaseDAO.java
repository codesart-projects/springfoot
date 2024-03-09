package com.codesart.springfoot.common.data;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

public class BaseDAO<T> extends ServiceImpl<BaseMapper<T>, T> {

}
