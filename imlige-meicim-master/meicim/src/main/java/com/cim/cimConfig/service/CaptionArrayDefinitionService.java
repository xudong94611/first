package com.cim.cimConfig.service;

import com.cim.cimConfig.domain.CaptionArrayDefinitionDO;

import java.util.List;
import java.util.Map;

public interface CaptionArrayDefinitionService {

	CaptionArrayDefinitionDO get(Integer captionArrayDefinitionId);

    List<CaptionArrayDefinitionDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(CaptionArrayDefinitionDO captionArrayDefinition);

    int update(CaptionArrayDefinitionDO captionArrayDefinition);

    int remove(Integer captionArrayDefinitionId);

    int batchRemove(Integer[] captionArrayDefinitionIds);
}
