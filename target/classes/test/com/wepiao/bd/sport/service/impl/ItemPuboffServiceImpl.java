package com.wepiao.bd.sport.service.impl;

import com.wepiao.bd.sport.bean.ItemPuboff;
import com.wepiao.bd.sport.bean.ItemPuboffCriteria;
import com.wepiao.bd.sport.dao.ItemPuboffMapper;
import com.wepiao.bd.sport.service.IItemPuboffService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemPuboffServiceImpl implements IItemPuboffService {
    @Autowired
    private ItemPuboffMapper itemPuboffMapper;

    private static final Logger logger = LoggerFactory.getLogger(ItemPuboffServiceImpl.class);

    public Long countByExample(ItemPuboffCriteria example) {
        long count = this.itemPuboffMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public ItemPuboff selectByPrimaryKey(String id) {
        return this.itemPuboffMapper.selectByPrimaryKey(id);
    }

    public List<ItemPuboff> selectByExample(ItemPuboffCriteria example) {
        return this.itemPuboffMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(String id) {
        return this.itemPuboffMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(ItemPuboff record) {
        return this.itemPuboffMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(ItemPuboff record) {
        return this.itemPuboffMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(ItemPuboffCriteria example) {
        return this.itemPuboffMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(ItemPuboff record, ItemPuboffCriteria example) {
        return this.itemPuboffMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(ItemPuboff record, ItemPuboffCriteria example) {
        return this.itemPuboffMapper.updateByExample(record, example);
    }

    public int insert(ItemPuboff record) {
        return this.itemPuboffMapper.insert(record);
    }

    public int insertSelective(ItemPuboff record) {
        return this.itemPuboffMapper.insertSelective(record);
    }
}