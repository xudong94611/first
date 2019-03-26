package com.cim.cim.service;

import com.cim.cim.domain.CheckInDO;

import java.util.List;
import java.util.Map;

public interface CheckInService {

    CheckInDO get(Integer checkInId);

    List<CheckInDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(CheckInDO checkIn);

    int update(CheckInDO checkIn);

    int remove(Integer checkInId);

    int batchRemove(Integer[] checkInIds);
}
