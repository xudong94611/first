package com.cim.cimConfig.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cim.cimConfig.dao.ConventionalSignContainerAttributesDao;
import com.cim.cimConfig.domain.ConventionalSignContainerAttributesDO;
import com.cim.cimConfig.service.ConventionalSignContainerAttributesService;

@Service
public class ConventionalSignContainerAttributesServiceImpl implements ConventionalSignContainerAttributesService {
    @Autowired
    private ConventionalSignContainerAttributesDao conventionalSignContainerAttributesDao;

    @Override
    public ConventionalSignContainerAttributesDO get(Integer conventionalSignContainerAttributesId) {
        return conventionalSignContainerAttributesDao.get(conventionalSignContainerAttributesId);
    }

    @Override
    public List<ConventionalSignContainerAttributesDO> list(Map<String, Object> map) {
        return conventionalSignContainerAttributesDao.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return conventionalSignContainerAttributesDao.count(map);
    }

    @Override
    public int save(ConventionalSignContainerAttributesDO conventionalSignContainerAttributes) {
        return conventionalSignContainerAttributesDao.save(conventionalSignContainerAttributes);
    }

    @Override
    public int update(ConventionalSignContainerAttributesDO conventionalSignContainerAttributes) {
        return conventionalSignContainerAttributesDao.update(conventionalSignContainerAttributes);
    }

    @Override
    public int remove(Integer conventionalSignContainerAttributesId) {
        return conventionalSignContainerAttributesDao.remove(conventionalSignContainerAttributesId);
    }

    @Override
    public int batchRemove(Integer[] conventionalSignContainerAttributesId) {
        return conventionalSignContainerAttributesDao.batchRemove(conventionalSignContainerAttributesId);
    }

}
