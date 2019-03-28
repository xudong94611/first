package com.cim.cimConfig.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cim.cimConfig.dao.ConstDao;
import com.cim.cimConfig.domain.ConstDO;
import com.cim.cimConfig.service.ConstService;

@Service
public class ConstServiceImpl implements ConstService {
    @Autowired
    private ConstDao constDao;

    @Override
    public ConstDO get(Integer constId) {
        return constDao.get(constId);
    }

    @Override
    public List<ConstDO> list(Map<String, Object> map) {
        return constDao.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return constDao.count(map);
    }

    @Override
    public int save(ConstDO const1) {
        return constDao.save(const1);
    }

    @Override
    public int update(ConstDO const1) {
        return constDao.update(const1);
    }

    @Override
    public int remove(Integer constId) {
        return constDao.remove(constId);
    }

    @Override
    public int batchRemove(Integer[] constIds) {
        return constDao.batchRemove(constIds);
    }

}
