package com.cim.cimConfig.dao;

import com.cim.cimConfig.domain.PortAttributesDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface PortAttributesDao {

    PortAttributesDO get(Integer portAttributesId);

    List<PortAttributesDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(PortAttributesDO portAttributes);

    int update(PortAttributesDO portAttributes);

    int remove(Integer portAttributesId);

    int batchRemove(Integer[] portAttributesIds);
}
