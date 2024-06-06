package com.codesart.springfoot.common.data.jpa.test.dao;

import com.codesart.springfoot.common.data.BaseDAO;
import com.codesart.springfoot.common.data.jpa.repository.BaseRepository;
import com.codesart.springfoot.common.data.jpa.test.entity.DemoUserDO;
import org.springframework.stereotype.Repository;

@Repository
public class DemoUserDAO extends BaseDAO<DemoUserDO> {

    public DemoUserDAO(BaseRepository<DemoUserDO> repository) {
        super(repository);
    }

}
