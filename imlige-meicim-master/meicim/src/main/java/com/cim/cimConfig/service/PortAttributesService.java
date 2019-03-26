package com.cim.cimConfig.service;

import com.cim.cimConfig.domain.PortAttributesDO;

import java.util.List;
import java.util.Map;

public interface PortAttributesService {

    PortAttributesDO get(Integer portAttributesId);

    List<PortAttributesDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(PortAttributesDO portAttributes);

    int update(PortAttributesDO portAttributes);

    int remove(Integer portAttributesId);

    int batchRemove(Integer[] portAttributesIds);
}
