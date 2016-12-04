package com.wepiao.bd.sport.service;

import com.wepiao.bd.sport.bean.ItemPuboff;
import com.wepiao.bd.sport.bean.ItemPuboffCriteria;
import java.util.List;

public interface IItemPuboffService {
    Long countByExample(ItemPuboffCriteria example);

    ItemPuboff selectByPrimaryKey(String id);

    List<ItemPuboff> selectByExample(ItemPuboffCriteria example);

    int deleteByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ItemPuboff record);

    int updateByPrimaryKey(ItemPuboff record);

    int deleteByExample(ItemPuboffCriteria example);

    int updateByExampleSelective(ItemPuboff record, ItemPuboffCriteria example);

    int updateByExample(ItemPuboff record, ItemPuboffCriteria example);

    int insert(ItemPuboff record);

    int insertSelective(ItemPuboff record);
}