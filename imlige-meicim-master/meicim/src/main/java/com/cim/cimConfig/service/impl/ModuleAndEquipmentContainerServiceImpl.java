package com.cim.cimConfig.service.impl;

import com.cim.cimConfig.dao.ModuleAndEquipmentContainerDao;
import com.cim.cimConfig.domain.ModuleAndEquipmentContainerDO;
import com.cim.cimConfig.service.ModuleAndEquipmentContainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ModuleAndEquipmentContainerServiceImpl implements ModuleAndEquipmentContainerService {
    @Autowired
    private ModuleAndEquipmentContainerDao moduleAndEquipmentContainerDao;

    @Override
    public ModuleAndEquipmentContainerDO get(Integer moduleAndEquipmentContainerId) {
        return moduleAndEquipmentContainerDao.get(moduleAndEquipmentContainerId);
    }

    @Override
    public List<ModuleAndEquipmentContainerDO> list(Map<String, Object> map) {
        return moduleAndEquipmentContainerDao.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return moduleAndEquipmentContainerDao.count(map);
    }

    @Override
    public int save(ModuleAndEquipmentContainerDO moduleAndEquipmentContainer) {
        return moduleAndEquipmentContainerDao.save(moduleAndEquipmentContainer);
    }

    @Override
    public int update(ModuleAndEquipmentContainerDO moduleAndEquipmentContainer) {
        return moduleAndEquipmentContainerDao.update(moduleAndEquipmentContainer);
    }

    @Override
    public int remove(Integer moduleAndEquipmentContainerId) {
        return moduleAndEquipmentContainerDao.remove(moduleAndEquipmentContainerId);
    }

    @Override
    public int batchRemove(Integer[] moduleAndEquipmentContainerIds) {
        return moduleAndEquipmentContainerDao.batchRemove(moduleAndEquipmentContainerIds);
    }

}
