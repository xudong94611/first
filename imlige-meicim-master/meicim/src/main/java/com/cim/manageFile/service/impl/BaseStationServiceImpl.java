package com.cim.manageFile.service.impl;

import com.cim.manageFile.dao.BaseStationDao;
import com.cim.manageFile.domain.BaseStationDO;
import com.cim.manageFile.service.BaseStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BaseStationServiceImpl implements BaseStationService {
    @Autowired
    private BaseStationDao baseStationDao;

    @Override
    public BaseStationDO get(Integer baseStationId) {
        return baseStationDao.get(baseStationId);
    }

    @Override
    public List<BaseStationDO> list(Map<String, Object> map) {
        return baseStationDao.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return baseStationDao.count(map);
    }

    @Override
    public int save(BaseStationDO baseStation) {
        if (baseStation.isEmpty())
            return 0;
        return baseStationDao.save(baseStation);
    }


    @Override
    public int update(BaseStationDO baseStation) {
        if (baseStation.isEmpty())
            return 0;
        return baseStationDao.update(baseStation);
    }

    @Override
    public int remove(Integer baseStationId) {
        return baseStationDao.remove(baseStationId);
    }

    @Override
    public int batchRemove(Integer[] baseStationIds) {
        return baseStationDao.batchRemove(baseStationIds);
    }

}
