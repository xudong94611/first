package com.cim.cimConfig.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cim.cimConfig.dao.CableDefinitionsDao;
import com.cim.cimConfig.domain.CableDefinitionsDO;
import com.cim.cimConfig.service.CableDefinitionsService;

@Service
public class CableDefinitionsServiceImpl implements CableDefinitionsService {
    @Autowired
    private CableDefinitionsDao cableDefinitionsDao;

    @Override
    public CableDefinitionsDO get(Integer cableDefinitionsId) {
        return cableDefinitionsDao.get(cableDefinitionsId);
    }

    @Override
    public List<CableDefinitionsDO> list(Map<String, Object> map) {
        return cableDefinitionsDao.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return cableDefinitionsDao.count(map);
    }

    @Override
    public int save(CableDefinitionsDO cableDefinitions) {
        return cableDefinitionsDao.save(cableDefinitions);
    }

    @Override
    public int update(CableDefinitionsDO cableDefinitions) {
        return cableDefinitionsDao.update(cableDefinitions);
    }

    @Override
    public int remove(Integer cableDefinitionsId) {
        return cableDefinitionsDao.remove(cableDefinitionsId);
    }

    @Override
    public int batchRemove(Integer[] cableDefinitionsIds) {
        return cableDefinitionsDao.batchRemove(cableDefinitionsIds);
    }

}
