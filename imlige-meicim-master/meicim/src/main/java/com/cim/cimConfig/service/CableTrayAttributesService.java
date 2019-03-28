package com.cim.cimConfig.service;

import com.cim.cimConfig.domain.CableTrayAttributesDO;

import java.util.List;
import java.util.Map;

public interface CableTrayAttributesService {

	CableTrayAttributesDO get(Integer cableTrayAttributesId);

    List<CableTrayAttributesDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(CableTrayAttributesDO cableTrayAttributes);

    int update(CableTrayAttributesDO cableTrayAttributes);

    int remove(Integer cableTrayAttributesId);

    int batchRemove(Integer[] cableTrayAttributesIds);
}
