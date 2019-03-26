package com.cim.cimConfig.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cim.cimConfig.dao.AntennaAttributesDao;
import com.cim.cimConfig.domain.AntennaAttributesDO;
import com.cim.cimConfig.service.AntennaAttributesService;

@Service
public class AntennaAttributesServiceImpl implements AntennaAttributesService {
    @Autowired
    private AntennaAttributesDao antennaAttributesDao;

    @Override
    public AntennaAttributesDO get(Integer antennaAttributesId) {
        return antennaAttributesDao.get(antennaAttributesId);
    }

    @Override
    public List<AntennaAttributesDO> list(Map<String, Object> map) {
        return antennaAttributesDao.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return antennaAttributesDao.count(map);
    }

    @Override
    public int save(AntennaAttributesDO antennaAttributes) {
        return antennaAttributesDao.save(antennaAttributes);
    }

    @Override
    public int update(AntennaAttributesDO antennaAttributes) {
        return antennaAttributesDao.update(antennaAttributes);
    }

    @Override
    public int remove(Integer antennaAttributesId) {
        return antennaAttributesDao.remove(antennaAttributesId);
    }

    @Override
    public int batchRemove(Integer[] antennaAttributesIds) {
        return antennaAttributesDao.batchRemove(antennaAttributesIds);
    }

}
