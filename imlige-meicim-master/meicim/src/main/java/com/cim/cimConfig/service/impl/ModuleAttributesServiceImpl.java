package com.cim.cimConfig.service.impl;

import com.cim.cimConfig.dao.ModuleAttributesDao;
import com.cim.cimConfig.domain.ModuleAttributesDO;
import com.cim.cimConfig.service.ModuleAttributesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ModuleAttributesServiceImpl implements ModuleAttributesService {
    @Autowired
    private ModuleAttributesDao moduleAttributesDao;

    @Override
    public ModuleAttributesDO get(Integer moduleAttributesId) {
        return moduleAttributesDao.get(moduleAttributesId);
    }

    @Override
    public List<ModuleAttributesDO> list(Map<String, Object> map) {
        return moduleAttributesDao.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return moduleAttributesDao.count(map);
    }

    @Override
    public int save(ModuleAttributesDO moduleAttributes) {
        return moduleAttributesDao.save(moduleAttributes);
    }

    @Override
    public int update(ModuleAttributesDO moduleAttributes) {
        return moduleAttributesDao.update(moduleAttributes);
    }

    @Override
    public int remove(Integer moduleAttributesId) {
        return moduleAttributesDao.remove(moduleAttributesId);
    }

    @Override
    public int batchRemove(Integer[] moduleAttributesIds) {
        return moduleAttributesDao.batchRemove(moduleAttributesIds);
    }

}
