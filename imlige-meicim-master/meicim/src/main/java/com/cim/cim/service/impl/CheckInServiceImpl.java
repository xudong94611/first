package com.cim.cim.service.impl;

import com.cim.cim.dao.CheckInDao;
import com.cim.cim.domain.CheckInDO;
import com.cim.cim.service.CheckInService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CheckInServiceImpl implements CheckInService {
    private final CheckInDao checkInDao;

    @Autowired
    public CheckInServiceImpl(CheckInDao checkInDao) {
        this.checkInDao = checkInDao;
    }

    @Override
    public CheckInDO get(Integer checkInId) {
        return checkInDao.get(checkInId);
    }

    @Override
    public List<CheckInDO> list(Map<String, Object> map) {
        return checkInDao.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return checkInDao.count(map);
    }

    @Override
    public int save(CheckInDO checkIn) {
        if(StringUtils.isEmpty(checkIn.getUsername())||checkIn.getLoginCount()==null)
            return 0;
        return checkInDao.save(checkIn);
    }

    @Override
    public int update(CheckInDO checkIn) {
        if(StringUtils.isEmpty(checkIn.getUsername())||checkIn.getLoginCount()==null)
            return 0;
        return checkInDao.update(checkIn);
    }

    @Override
    public int remove(Integer checkInId) {
        return checkInDao.remove(checkInId);
    }

    @Override
    public int batchRemove(Integer[] checkInIds) {
        return checkInDao.batchRemove(checkInIds);
    }

}
