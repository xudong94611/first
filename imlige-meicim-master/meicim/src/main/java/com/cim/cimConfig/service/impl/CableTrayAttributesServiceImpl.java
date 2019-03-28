package com.cim.cimConfig.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cim.cimConfig.dao.CableTrayAttributesDao;
import com.cim.cimConfig.domain.CableTrayAttributesDO;
import com.cim.cimConfig.service.CableTrayAttributesService;

@Service
public class CableTrayAttributesServiceImpl implements CableTrayAttributesService {
    @Autowired
    private CableTrayAttributesDao cableTrayAttributesDao;

    @Override
    public CableTrayAttributesDO get(Integer cableTrayAttributesId) {
        return cableTrayAttributesDao.get(cableTrayAttributesId);
    }

    @Override
    public List<CableTrayAttributesDO> list(Map<String, Object> map) {
        return cableTrayAttributesDao.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return cableTrayAttributesDao.count(map);
    }

    @Override
    public int save(CableTrayAttributesDO cableTrayAttributes) {
        return cableTrayAttributesDao.save(cableTrayAttributes);
    }

    @Override
    public int update(CableTrayAttributesDO cableTrayAttributes) {
        return cableTrayAttributesDao.update(cableTrayAttributes);
    }

    @Override
    public int remove(Integer cableTrayAttributesId) {
        return cableTrayAttributesDao.remove(cableTrayAttributesId);
    }

    @Override
    public int batchRemove(Integer[] cableTrayAttributesIds) {
        return cableTrayAttributesDao.batchRemove(cableTrayAttributesIds);
    }

}
