package com.cim.cimConfig.service;

import com.cim.cimConfig.domain.PortGroupContainerDO;

import java.util.List;
import java.util.Map;

public interface PortGroupContainerService {

    PortGroupContainerDO get(Integer portGroupContainerId);

    List<PortGroupContainerDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(PortGroupContainerDO portGroupContainer);

    int update(PortGroupContainerDO portGroupContainer);

    int remove(Integer portGroupContainerId);

    int batchRemove(Integer[] portGroupContainerIds);
}
