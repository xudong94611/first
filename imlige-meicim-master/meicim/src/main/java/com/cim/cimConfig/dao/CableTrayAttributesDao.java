package com.cim.cimConfig.dao;

import com.cim.cimConfig.domain.CableTrayAttributesDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CableTrayAttributesDao {

	CableTrayAttributesDO get(Integer cableTrayAttributesId);

    List<CableTrayAttributesDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(CableTrayAttributesDO cableTrayAttributes);

    int update(CableTrayAttributesDO cableTrayAttributes);

    int remove(Integer cableTrayAttributesId);

    int batchRemove(Integer[] cableTrayAttributesIds);
}
