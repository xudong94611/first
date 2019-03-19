package com.cim.cimConfig.service.impl;

import com.cim.cimConfig.dao.BasebandEquipmentCorrespondingCarrierUnitDao;
import com.cim.cimConfig.domain.BasebandEquipmentCorrespondingCarrierUnitDO;
import com.cim.cimConfig.service.BasebandEquipmentCorrespondingCarrierUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BasebandEquipmentCorrespondingCarrierUnitServiceImpl implements BasebandEquipmentCorrespondingCarrierUnitService {
    @Autowired
    private BasebandEquipmentCorrespondingCarrierUnitDao basebandEquipmentCorrespondingCarrierUnitDao;

    @Override
    public BasebandEquipmentCorrespondingCarrierUnitDO get(Integer basebandEquipmentCorrespondingCarrierUnitId) {
        return basebandEquipmentCorrespondingCarrierUnitDao.get(basebandEquipmentCorrespondingCarrierUnitId);
    }

    @Override
    public List<BasebandEquipmentCorrespondingCarrierUnitDO> list(Map<String, Object> map) {
        return basebandEquipmentCorrespondingCarrierUnitDao.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return basebandEquipmentCorrespondingCarrierUnitDao.count(map);
    }

    @Override
    public int save(BasebandEquipmentCorrespondingCarrierUnitDO basebandEquipmentCorrespondingCarrierUnit) {
        return basebandEquipmentCorrespondingCarrierUnitDao.save(basebandEquipmentCorrespondingCarrierUnit);
    }

    @Override
    public int update(BasebandEquipmentCorrespondingCarrierUnitDO basebandEquipmentCorrespondingCarrierUnit) {
        return basebandEquipmentCorrespondingCarrierUnitDao.update(basebandEquipmentCorrespondingCarrierUnit);
    }

    @Override
    public int remove(Integer basebandEquipmentCorrespondingCarrierUnitId) {
        return basebandEquipmentCorrespondingCarrierUnitDao.remove(basebandEquipmentCorrespondingCarrierUnitId);
    }

    @Override
    public int batchRemove(Integer[] basebandEquipmentCorrespondingCarrierUnitIds) {
        return basebandEquipmentCorrespondingCarrierUnitDao.batchRemove(basebandEquipmentCorrespondingCarrierUnitIds);
    }

}
