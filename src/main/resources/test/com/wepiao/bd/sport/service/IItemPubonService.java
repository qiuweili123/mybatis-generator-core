package com.wepiao.bd.sport.service;

import com.wepiao.bd.sport.bean.ItemPubon;
import com.wepiao.bd.sport.bean.ItemPubonCriteria;
import java.util.List;

public interface IItemPubonService {
    Long countByExample(ItemPubonCriteria example);

    ItemPubon selectByPrimaryKey(String id);

    List<ItemPubon> selectByExample(ItemPubonCriteria example);

    int deleteByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ItemPubon record);

    int updateByPrimaryKey(ItemPubon record);

    int deleteByExample(ItemPubonCriteria example);

    int updateByExampleSelective(ItemPubon record, ItemPubonCriteria example);

    int updateByExample(ItemPubon record, ItemPubonCriteria example);

    int insert(ItemPubon record);

    int insertSelective(ItemPubon record);
}