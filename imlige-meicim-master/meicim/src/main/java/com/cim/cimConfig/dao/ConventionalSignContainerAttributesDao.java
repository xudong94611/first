package com.cim.cimConfig.dao;

import com.cim.cimConfig.domain.ConventionalSignContainerAttributesDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ConventionalSignContainerAttributesDao {

	ConventionalSignContainerAttributesDO get(Integer conventionalSignContainerAttributesId);

    List<ConventionalSignContainerAttributesDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(ConventionalSignContainerAttributesDO conventionalSignContainerAttributes);

    int update(ConventionalSignContainerAttributesDO conventionalSignContainerAttributes);

    int remove(Integer conventionalSignContainerAttributesId);

    int batchRemove(Integer[] conventionalSignContainerAttributesIds);
}
