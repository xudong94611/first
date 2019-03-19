package com.cim.cim.dao;

import com.cim.cim.domain.CheckInDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CheckInDao {

    CheckInDO get(Integer checkInId);

    List<CheckInDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(CheckInDO checkIn);

    int update(CheckInDO checkIn);

    int remove(Integer checkInId);

    int batchRemove(Integer[] checkInIds);
}
