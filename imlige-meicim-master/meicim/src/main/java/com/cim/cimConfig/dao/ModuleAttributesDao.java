package com.cim.cimConfig.dao;

import com.cim.cimConfig.domain.ModuleAttributesDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface ModuleAttributesDao {

    ModuleAttributesDO get(Integer moduleAttributesId);

    List<ModuleAttributesDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(ModuleAttributesDO moduleAttributes);

    int update(ModuleAttributesDO moduleAttributes);

    int remove(Integer moduleAttributesId);

    int batchRemove(Integer[] moduleAttributesIds);
}
