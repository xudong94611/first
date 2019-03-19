package com.cim.cimConfig.service.impl;

import com.cim.cimConfig.dao.PortAttributesDao;
import com.cim.cimConfig.domain.PortAttributesDO;
import com.cim.cimConfig.service.PortAttributesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PortAttributesServiceImpl implements PortAttributesService {
    @Autowired
    private PortAttributesDao portAttributesDao;

    @Override
    public PortAttributesDO get(Integer portAttributesId) {
        return portAttributesDao.get(portAttributesId);
    }

    @Override
    public List<PortAttributesDO> list(Map<String, Object> map) {
        return portAttributesDao.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return portAttributesDao.count(map);
    }

    @Override
    public int save(PortAttributesDO portAttributes) {
        return portAttributesDao.save(portAttributes);
    }

    @Override
    public int update(PortAttributesDO portAttributes) {
        return portAttributesDao.update(portAttributes);
    }

    @Override
    public int remove(Integer portAttributesId) {
        return portAttributesDao.remove(portAttributesId);
    }

    @Override
    public int batchRemove(Integer[] portAttributesIds) {
        return portAttributesDao.batchRemove(portAttributesIds);
    }

}
