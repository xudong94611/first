package com.cim.cimConfig.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cim.cimConfig.dao.CaptionArrayDefinitionDao;
import com.cim.cimConfig.domain.CaptionArrayDefinitionDO;
import com.cim.cimConfig.service.CaptionArrayDefinitionService;

@Service
public class CaptionArrayDefinitionServiceImpl implements CaptionArrayDefinitionService {
    @Autowired
    private CaptionArrayDefinitionDao captionArrayDefinitionDao;

    @Override
    public CaptionArrayDefinitionDO get(Integer captionArrayDefinitionId) {
        return captionArrayDefinitionDao.get(captionArrayDefinitionId);
    }

    @Override
    public List<CaptionArrayDefinitionDO> list(Map<String, Object> map) {
        return captionArrayDefinitionDao.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return captionArrayDefinitionDao.count(map);
    }

    @Override
    public int save(CaptionArrayDefinitionDO cableTrayAttributes) {
        return captionArrayDefinitionDao.save(cableTrayAttributes);
    }

    @Override
    public int update(CaptionArrayDefinitionDO cableTrayAttributes) {
        return captionArrayDefinitionDao.update(cableTrayAttributes);
    }

    @Override
    public int remove(Integer cableTrayAttributesId) {
        return captionArrayDefinitionDao.remove(cableTrayAttributesId);
    }

    @Override
    public int batchRemove(Integer[] cableTrayAttributesIds) {
        return captionArrayDefinitionDao.batchRemove(cableTrayAttributesIds);
    }

}
