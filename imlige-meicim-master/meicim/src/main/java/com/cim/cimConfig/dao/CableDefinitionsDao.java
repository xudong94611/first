package com.cim.cimConfig.dao;

import com.cim.cimConfig.domain.CableDefinitionsDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CableDefinitionsDao {

	CableDefinitionsDO get(Integer cableDefinitionsId);

    List<CableDefinitionsDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(CableDefinitionsDO cableDefinitions);

    int update(CableDefinitionsDO cableDefinitions);

    int remove(Integer cableDefinitionsId);

    int batchRemove(Integer[] cableDefinitionsIds);
}
