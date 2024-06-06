package com.codesart.springfoot.common.data.jpa.test.repository;

import com.codesart.springfoot.common.data.jpa.repository.BaseRepository;
import com.codesart.springfoot.common.data.jpa.test.entity.DemoUserDO;

public interface DemoUserRepository extends BaseRepository<DemoUserDO> {

    public DemoUserDO findByUsernameLike(String userName);

}
