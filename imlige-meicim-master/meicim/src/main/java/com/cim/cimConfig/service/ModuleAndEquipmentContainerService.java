package com.cim.cimConfig.service;

import com.cim.cimConfig.domain.ModuleAndEquipmentContainerDO;

import java.util.List;
import java.util.Map;

public interface ModuleAndEquipmentContainerService {

    ModuleAndEquipmentContainerDO get(Integer moduleAndEquipmentContainerId);

    List<ModuleAndEquipmentContainerDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(ModuleAndEquipmentContainerDO moduleAndEquipmentContainer);

    int update(ModuleAndEquipmentContainerDO moduleAndEquipmentContainer);

    int remove(Integer moduleAndEquipmentContainerId);

    int batchRemove(Integer[] moduleAndEquipmentContainerIds);
}
