package com.cim.cimConfig.service;

import com.cim.cimConfig.domain.ModuleAttributesDO;

import java.util.List;
import java.util.Map;

public interface ModuleAttributesService {

    ModuleAttributesDO get(Integer moduleAttributesId);

    List<ModuleAttributesDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(ModuleAttributesDO moduleAttributes);

    int update(ModuleAttributesDO moduleAttributes);

    int remove(Integer moduleAttributesId);

    int batchRemove(Integer[] moduleAttributesIds);
}
