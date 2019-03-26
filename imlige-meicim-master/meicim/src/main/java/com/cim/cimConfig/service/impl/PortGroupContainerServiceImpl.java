package com.cim.cimConfig.service.impl;

import com.cim.cimConfig.dao.PortGroupContainerDao;
import com.cim.cimConfig.domain.PortGroupContainerDO;
import com.cim.cimConfig.service.PortGroupContainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PortGroupContainerServiceImpl implements PortGroupContainerService {
    @Autowired
    private PortGroupContainerDao portGroupContainerDao;

    @Override
    public PortGroupContainerDO get(Integer portGroupContainerId) {
        return portGroupContainerDao.get(portGroupContainerId);
    }

    @Override
    public List<PortGroupContainerDO> list(Map<String, Object> map) {
        return portGroupContainerDao.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return portGroupContainerDao.count(map);
    }

    @Override
    public int save(PortGroupContainerDO portGroupContainer) {
        return portGroupContainerDao.save(portGroupContainer);
    }

    @Override
    public int update(PortGroupContainerDO portGroupContainer) {
        return portGroupContainerDao.update(portGroupContainer);
    }

    @Override
    public int remove(Integer portGroupContainerId) {
        return portGroupContainerDao.remove(portGroupContainerId);
    }

    @Override
    public int batchRemove(Integer[] portGroupContainerIds) {
        return portGroupContainerDao.batchRemove(portGroupContainerIds);
    }

}
