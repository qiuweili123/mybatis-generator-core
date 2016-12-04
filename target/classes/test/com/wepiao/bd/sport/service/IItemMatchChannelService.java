package com.wepiao.bd.sport.service;

import com.wepiao.bd.sport.bean.ItemMatchChannel;
import com.wepiao.bd.sport.bean.ItemMatchChannelCriteria;
import java.util.List;

public interface IItemMatchChannelService {
    Long countByExample(ItemMatchChannelCriteria example);

    ItemMatchChannel selectByPrimaryKey(String id);

    List<ItemMatchChannel> selectByExample(ItemMatchChannelCriteria example);

    int deleteByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ItemMatchChannel record);

    int updateByPrimaryKey(ItemMatchChannel record);

    int deleteByExample(ItemMatchChannelCriteria example);

    int updateByExampleSelective(ItemMatchChannel record, ItemMatchChannelCriteria example);

    int updateByExample(ItemMatchChannel record, ItemMatchChannelCriteria example);

    int insert(ItemMatchChannel record);

    int insertSelective(ItemMatchChannel record);
}