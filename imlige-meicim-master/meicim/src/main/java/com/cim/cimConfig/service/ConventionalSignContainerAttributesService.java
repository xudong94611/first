package com.cim.cimConfig.service;

import com.cim.cimConfig.domain.ConventionalSignContainerAttributesDO;

import java.util.List;
import java.util.Map;

public interface ConventionalSignContainerAttributesService {

	ConventionalSignContainerAttributesDO get(Integer conventionalSignContainerAttributesId);

    List<ConventionalSignContainerAttributesDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(ConventionalSignContainerAttributesDO conventionalSignContainerAttributes);

    int update(ConventionalSignContainerAttributesDO conventionalSignContainerAttributes);

    int remove(Integer conventionalSignContainerAttributesId);

    int batchRemove(Integer[] conventionalSignContainerAttributesIds);
}
