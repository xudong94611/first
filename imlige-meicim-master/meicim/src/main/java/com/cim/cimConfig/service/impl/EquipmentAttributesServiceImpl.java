package com.cim.cimConfig.service.impl;

import com.cim.cimConfig.dao.AntennaAttributesDao;
import com.cim.cimConfig.dao.EquipmentAttributesDao;
import com.cim.cimConfig.domain.AntennaAttributesDO;
import com.cim.cimConfig.domain.EquipmentAttributesDO;
import com.cim.cimConfig.service.AntennaAttributesService;
import com.cim.cimConfig.service.EquipmentAttributesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class EquipmentAttributesServiceImpl implements EquipmentAttributesService {
    @Autowired
    private EquipmentAttributesDao equipmentAttributesDao;

    @Override
    public EquipmentAttributesDO get(Integer equipmentAttributesId) {
        return equipmentAttributesDao.get(equipmentAttributesId);
    }

    @Override
    public List<EquipmentAttributesDO> list(Map<String, Object> map) {
        return equipmentAttributesDao.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return equipmentAttributesDao.count(map);
    }

    @Override
    public int save(EquipmentAttributesDO equipmentAttributes) {
        return equipmentAttributesDao.save(equipmentAttributes);
    }

    @Override
    public int update(EquipmentAttributesDO equipmentAttributes) {
        return equipmentAttributesDao.update(equipmentAttributes);
    }

    @Override
    public int remove(Integer equipmentAttributesId) {
        return equipmentAttributesDao.remove(equipmentAttributesId);
    }

    @Override
    public int batchRemove(Integer[] equipmentAttributesIds) {
        return equipmentAttributesDao.batchRemove(equipmentAttributesIds);
    }

}
