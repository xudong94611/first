package com.cim.cimConfig.dao;

import com.cim.cimConfig.domain.CaptionArrayDefinitionDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CaptionArrayDefinitionDao {

	CaptionArrayDefinitionDO get(Integer captionArrayDefinitionId);

    List<CaptionArrayDefinitionDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(CaptionArrayDefinitionDO captionArrayDefinition);

    int update(CaptionArrayDefinitionDO captionArrayDefinition);

    int remove(Integer captionArrayDefinitionId);

    int batchRemove(Integer[] captionArrayDefinitionIds);
}
