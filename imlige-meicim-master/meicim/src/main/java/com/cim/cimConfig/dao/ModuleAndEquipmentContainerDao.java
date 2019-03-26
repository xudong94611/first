package com.cim.cimConfig.dao;

import com.cim.cimConfig.domain.ModuleAndEquipmentContainerDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface ModuleAndEquipmentContainerDao {

    ModuleAndEquipmentContainerDO get(Integer moduleAndEquipmentContainerId);

    List<ModuleAndEquipmentContainerDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(ModuleAndEquipmentContainerDO moduleAndEquipmentContainer);

    int update(ModuleAndEquipmentContainerDO moduleAndEquipmentContainer);

    int remove(Integer moduleAndEquipmentContainerId);

    int batchRemove(Integer[] moduleAndEquipmentContainerIds);
}
