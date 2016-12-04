package com.wepiao.bd.sport.service;

import com.wepiao.bd.sport.bean.AppAccess;
import com.wepiao.bd.sport.bean.AppAccessCriteria;
import java.util.List;

public interface IAppAccessService {
    Long countByExample(AppAccessCriteria example);

    AppAccess selectByPrimaryKey(String id);

    List<AppAccess> selectByExample(AppAccessCriteria example);

    int deleteByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AppAccess record);

    int updateByPrimaryKey(AppAccess record);

    int deleteByExample(AppAccessCriteria example);

    int updateByExampleSelective(AppAccess record, AppAccessCriteria example);

    int updateByExample(AppAccess record, AppAccessCriteria example);

    int insert(AppAccess record);

    int insertSelective(AppAccess record);
}