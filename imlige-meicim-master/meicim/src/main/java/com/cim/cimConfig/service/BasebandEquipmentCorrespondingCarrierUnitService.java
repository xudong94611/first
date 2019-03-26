package com.cim.cimConfig.service;

import com.cim.cimConfig.domain.BasebandEquipmentCorrespondingCarrierUnitDO;

import java.util.List;
import java.util.Map;

public interface BasebandEquipmentCorrespondingCarrierUnitService {

    BasebandEquipmentCorrespondingCarrierUnitDO get(Integer basebandEquipmentCorrespondingCarrierUnitId);

    List<BasebandEquipmentCorrespondingCarrierUnitDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(BasebandEquipmentCorrespondingCarrierUnitDO basebandEquipmentCorrespondingCarrierUnit);

    int update(BasebandEquipmentCorrespondingCarrierUnitDO basebandEquipmentCorrespondingCarrierUnit);

    int remove(Integer basebandEquipmentCorrespondingCarrierUnitId);

    int batchRemove(Integer[] basebandEquipmentCorrespondingCarrierUnitIds);
}
