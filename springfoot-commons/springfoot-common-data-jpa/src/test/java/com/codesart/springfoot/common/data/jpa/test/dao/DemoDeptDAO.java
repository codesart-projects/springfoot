package com.codesart.springfoot.common.data.jpa.test.dao;

import com.codesart.springfoot.common.data.BaseDAO;
import com.codesart.springfoot.common.data.jpa.repository.BaseRepository;
import com.codesart.springfoot.common.data.jpa.test.entity.DemoDeptDO;
import org.springframework.stereotype.Repository;

@Repository
public class DemoDeptDAO extends BaseDAO<DemoDeptDO> {

    public DemoDeptDAO(BaseRepository<DemoDeptDO> repository) {
        super(repository);
    }

}
