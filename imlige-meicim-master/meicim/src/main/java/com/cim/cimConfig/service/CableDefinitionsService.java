package com.cim.cimConfig.service;

import com.cim.cimConfig.domain.CableDefinitionsDO;

import java.util.List;
import java.util.Map;

public interface CableDefinitionsService {

	CableDefinitionsDO get(Integer cableDefinitionsId);

    List<CableDefinitionsDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(CableDefinitionsDO cableDefinitions);

    int update(CableDefinitionsDO cableDefinitions);

    int remove(Integer cableDefinitionsId);

    int batchRemove(Integer[] cableDefinitionsIds);
}
