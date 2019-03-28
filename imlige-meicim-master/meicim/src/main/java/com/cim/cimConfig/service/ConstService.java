package com.cim.cimConfig.service;

import com.cim.cimConfig.domain.ConstDO;

import java.util.List;
import java.util.Map;

public interface ConstService {

	ConstDO get(Integer constId);

    List<ConstDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(ConstDO const1);

    int update(ConstDO const1);

    int remove(Integer constId);

    int batchRemove(Integer[] constIds);
}
