package com.wepiao.bd.sport.service;

import com.wepiao.bd.sport.bean.ItemInfo;
import com.wepiao.bd.sport.bean.ItemInfoCriteria;
import java.util.List;

public interface IItemInfoService {
    Long countByExample(ItemInfoCriteria example);

    ItemInfo selectByPrimaryKey(String id);

    List<ItemInfoWithBLOBs> selectByExampleWithoutBLOBs(ItemInfoCriteria example);

    int deleteByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ItemInfo record);

    int updateByPrimaryKey(ItemInfo record);

    int deleteByExample(ItemInfoCriteria example);

    int updateByExampleSelective(ItemInfo record, ItemInfoCriteria example);

    int updateByExample(ItemInfo record, ItemInfoCriteria example);

    int insert(ItemInfo record);

    int insertSelective(ItemInfo record);
}