package com.wepiao.bd.sport.service.impl;

import com.wepiao.bd.sport.bean.ItemScreenings;
import com.wepiao.bd.sport.bean.ItemScreeningsCriteria;
import com.wepiao.bd.sport.dao.ItemScreeningsMapper;
import com.wepiao.bd.sport.service.IItemScreeningsService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemScreeningsServiceImpl implements IItemScreeningsService {
    @Autowired
    private ItemScreeningsMapper itemScreeningsMapper;

    private static final Logger logger = LoggerFactory.getLogger(ItemScreeningsServiceImpl.class);

    public Long countByExample(ItemScreeningsCriteria example) {
        long count = this.itemScreeningsMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public ItemScreenings selectByPrimaryKey(String id) {
        return this.itemScreeningsMapper.selectByPrimaryKey(id);
    }

    public List<ItemScreenings> selectByExample(ItemScreeningsCriteria example) {
        return this.itemScreeningsMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(String id) {
        return this.itemScreeningsMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(ItemScreenings record) {
        return this.itemScreeningsMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(ItemScreenings record) {
        return this.itemScreeningsMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(ItemScreeningsCriteria example) {
        return this.itemScreeningsMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(ItemScreenings record, ItemScreeningsCriteria example) {
        return this.itemScreeningsMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(ItemScreenings record, ItemScreeningsCriteria example) {
        return this.itemScreeningsMapper.updateByExample(record, example);
    }

    public int insert(ItemScreenings record) {
        return this.itemScreeningsMapper.insert(record);
    }

    public int insertSelective(ItemScreenings record) {
        return this.itemScreeningsMapper.insertSelective(record);
    }
}