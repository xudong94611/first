package com.cim.cimConfig.dao;

import com.cim.cimConfig.domain.EquipmentAttributesDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface EquipmentAttributesDao {

    EquipmentAttributesDO get(Integer equipmentAttributesId);

    List<EquipmentAttributesDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(EquipmentAttributesDO equipmentAttributes);

    int update(EquipmentAttributesDO equipmentAttributes);

    int remove(Integer equipmentAttributesId);

    int batchRemove(Integer[] equipmentAttributesIds);
}
