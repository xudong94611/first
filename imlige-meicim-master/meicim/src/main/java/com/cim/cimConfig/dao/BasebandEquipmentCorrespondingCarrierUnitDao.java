package com.cim.cimConfig.dao;

import com.cim.cimConfig.domain.BasebandEquipmentCorrespondingCarrierUnitDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface BasebandEquipmentCorrespondingCarrierUnitDao {

    BasebandEquipmentCorrespondingCarrierUnitDO get(Integer basebandEquipmentCorrespondingCarrierUnitId);

    List<BasebandEquipmentCorrespondingCarrierUnitDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(BasebandEquipmentCorrespondingCarrierUnitDO basebandEquipmentCorrespondingCarrierUnit);

    int update(BasebandEquipmentCorrespondingCarrierUnitDO basebandEquipmentCorrespondingCarrierUnit);

    int remove(Integer basebandEquipmentCorrespondingCarrierUnitId);

    int batchRemove(Integer[] basebandEquipmentCorrespondingCarrierUnitIds);
}
