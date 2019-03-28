package com.cim.cimConfig.dao;

import com.cim.cimConfig.domain.ConstDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ConstDao {

	ConstDO get(Integer constId);

    List<ConstDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(ConstDO const1);

    int update(ConstDO const1);

    int remove(Integer constId);

    int batchRemove(Integer[] constIds);
}
