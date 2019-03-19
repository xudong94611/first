package com.cim.cimConfig.dao;

import com.cim.cimConfig.domain.PortGroupContainerDO;
import com.cim.cimConfig.domain.PortGroupContainerDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface PortGroupContainerDao {

    PortGroupContainerDO get(Integer portGroupContainerId);

    List<PortGroupContainerDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(PortGroupContainerDO portGroupContainer);

    int update(PortGroupContainerDO portGroupContainer);

    int remove(Integer portGroupContainerId);

    int batchRemove(Integer[] portGroupContainerIds);
}
