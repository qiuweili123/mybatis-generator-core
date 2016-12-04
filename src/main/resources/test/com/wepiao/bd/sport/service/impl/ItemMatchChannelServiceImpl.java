package com.wepiao.bd.sport.service.impl;

import com.wepiao.bd.sport.bean.ItemMatchChannel;
import com.wepiao.bd.sport.bean.ItemMatchChannelCriteria;
import com.wepiao.bd.sport.dao.ItemMatchChannelMapper;
import com.wepiao.bd.sport.service.IItemMatchChannelService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemMatchChannelServiceImpl implements IItemMatchChannelService {
    @Autowired
    private ItemMatchChannelMapper itemMatchChannelMapper;

    private static final Logger logger = LoggerFactory.getLogger(ItemMatchChannelServiceImpl.class);

    public Long countByExample(ItemMatchChannelCriteria example) {
        long count = this.itemMatchChannelMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public ItemMatchChannel selectByPrimaryKey(String id) {
        return this.itemMatchChannelMapper.selectByPrimaryKey(id);
    }

    public List<ItemMatchChannel> selectByExample(ItemMatchChannelCriteria example) {
        return this.itemMatchChannelMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(String id) {
        return this.itemMatchChannelMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(ItemMatchChannel record) {
        return this.itemMatchChannelMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(ItemMatchChannel record) {
        return this.itemMatchChannelMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(ItemMatchChannelCriteria example) {
        return this.itemMatchChannelMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(ItemMatchChannel record, ItemMatchChannelCriteria example) {
        return this.itemMatchChannelMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(ItemMatchChannel record, ItemMatchChannelCriteria example) {
        return this.itemMatchChannelMapper.updateByExample(record, example);
    }

    public int insert(ItemMatchChannel record) {
        return this.itemMatchChannelMapper.insert(record);
    }

    public int insertSelective(ItemMatchChannel record) {
        return this.itemMatchChannelMapper.insertSelective(record);
    }
}