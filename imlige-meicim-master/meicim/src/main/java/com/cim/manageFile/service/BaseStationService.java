package com.cim.manageFile.service;

import com.cim.manageFile.domain.BaseStationDO;

import java.util.List;
import java.util.Map;

public interface BaseStationService {

    BaseStationDO get(Integer manageFileId);

    List<BaseStationDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(BaseStationDO manageFile);

    int update(BaseStationDO manageFile);

    int remove(Integer manageFileId);

    int batchRemove(Integer[] manageFileIds);
}
