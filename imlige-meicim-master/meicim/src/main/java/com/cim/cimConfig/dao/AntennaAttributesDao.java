package com.cim.cimConfig.dao;

import com.cim.cimConfig.domain.AntennaAttributesDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface AntennaAttributesDao {

    AntennaAttributesDO get(Integer antennaAttributesId);

    List<AntennaAttributesDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(AntennaAttributesDO antennaAttributes);

    int update(AntennaAttributesDO antennaAttributes);

    int remove(Integer antennaAttributesId);

    int batchRemove(Integer[] antennaAttributesIds);
}
