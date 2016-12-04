package com.wepiao.bd.sport.service.impl;

import com.wepiao.bd.sport.bean.ItemPubon;
import com.wepiao.bd.sport.bean.ItemPubonCriteria;
import com.wepiao.bd.sport.dao.ItemPubonMapper;
import com.wepiao.bd.sport.service.IItemPubonService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemPubonServiceImpl implements IItemPubonService {
    @Autowired
    private ItemPubonMapper itemPubonMapper;

    private static final Logger logger = LoggerFactory.getLogger(ItemPubonServiceImpl.class);

    public Long countByExample(ItemPubonCriteria example) {
        long count = this.itemPubonMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public ItemPubon selectByPrimaryKey(String id) {
        return this.itemPubonMapper.selectByPrimaryKey(id);
    }

    public List<ItemPubon> selectByExample(ItemPubonCriteria example) {
        return this.itemPubonMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(String id) {
        return this.itemPubonMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(ItemPubon record) {
        return this.itemPubonMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(ItemPubon record) {
        return this.itemPubonMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(ItemPubonCriteria example) {
        return this.itemPubonMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(ItemPubon record, ItemPubonCriteria example) {
        return this.itemPubonMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(ItemPubon record, ItemPubonCriteria example) {
        return this.itemPubonMapper.updateByExample(record, example);
    }

    public int insert(ItemPubon record) {
        return this.itemPubonMapper.insert(record);
    }

    public int insertSelective(ItemPubon record) {
        return this.itemPubonMapper.insertSelective(record);
    }
}