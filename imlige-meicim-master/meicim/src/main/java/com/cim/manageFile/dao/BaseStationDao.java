package com.cim.manageFile.dao;

import com.cim.manageFile.domain.BaseStationDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface BaseStationDao {

    BaseStationDO get(Integer manageFileId);

    List<BaseStationDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(BaseStationDO manageFile);

    int update(BaseStationDO manageFile);

    int remove(Integer manageFileId);

    int batchRemove(Integer[] manageFileIds);
}
