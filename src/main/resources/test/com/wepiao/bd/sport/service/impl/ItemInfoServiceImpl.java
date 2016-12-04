package com.wepiao.bd.sport.service.impl;

import com.wepiao.bd.sport.bean.ItemInfo;
import com.wepiao.bd.sport.bean.ItemInfoCriteria;
import com.wepiao.bd.sport.dao.ItemInfoMapper;
import com.wepiao.bd.sport.service.IItemInfoService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemInfoServiceImpl implements IItemInfoService {
    @Autowired
    private ItemInfoMapper itemInfoMapper;

    private static final Logger logger = LoggerFactory.getLogger(ItemInfoServiceImpl.class);

    public Long countByExample(ItemInfoCriteria example) {
        long count = this.itemInfoMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public ItemInfo selectByPrimaryKey(String id) {
        return this.itemInfoMapper.selectByPrimaryKey(id);
    }

    public List<ItemInfoWithBLOBs> selectByExampleWithoutBLOBs(ItemInfoCriteria example) {
        return this.itemInfoMapper.selectByExampleWithoutBLOBs(example);
    }

    public int deleteByPrimaryKey(String id) {
        return this.itemInfoMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(ItemInfo record) {
        return this.itemInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(ItemInfo record) {
        return this.itemInfoMapper.updateByPrimaryKeyWithoutBLOBs(record);
    }

    public int deleteByExample(ItemInfoCriteria example) {
        return this.itemInfoMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(ItemInfo record, ItemInfoCriteria example) {
        return this.itemInfoMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(ItemInfo record, ItemInfoCriteria example) {
        return this.itemInfoMapper.updateByExampleWithoutBLOBs(record, example);
    }

    public int insert(ItemInfo record) {
        return this.itemInfoMapper.insert(record);
    }

    public int insertSelective(ItemInfo record) {
        return this.itemInfoMapper.insertSelective(record);
    }
}