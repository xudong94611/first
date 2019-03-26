package com.cim.cimConfig.service;

import com.cim.cimConfig.domain.AntennaAttributesDO;
import com.cim.cimConfig.domain.EquipmentAttributesDO;

import java.util.List;
import java.util.Map;

public interface EquipmentAttributesService {

    EquipmentAttributesDO get(Integer equipmentAttributesId);

    List<EquipmentAttributesDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(EquipmentAttributesDO equipmentAttributes);

    int update(EquipmentAttributesDO equipmentAttributes);

    int remove(Integer equipmentAttributesId);

    int batchRemove(Integer[] equipmentAttributesIds);
}
