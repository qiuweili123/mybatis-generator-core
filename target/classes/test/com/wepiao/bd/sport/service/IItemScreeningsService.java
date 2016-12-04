package com.wepiao.bd.sport.service;

import com.wepiao.bd.sport.bean.ItemScreenings;
import com.wepiao.bd.sport.bean.ItemScreeningsCriteria;
import java.util.List;

public interface IItemScreeningsService {
    Long countByExample(ItemScreeningsCriteria example);

    ItemScreenings selectByPrimaryKey(String id);

    List<ItemScreenings> selectByExample(ItemScreeningsCriteria example);

    int deleteByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ItemScreenings record);

    int updateByPrimaryKey(ItemScreenings record);

    int deleteByExample(ItemScreeningsCriteria example);

    int updateByExampleSelective(ItemScreenings record, ItemScreeningsCriteria example);

    int updateByExample(ItemScreenings record, ItemScreeningsCriteria example);

    int insert(ItemScreenings record);

    int insertSelective(ItemScreenings record);
}