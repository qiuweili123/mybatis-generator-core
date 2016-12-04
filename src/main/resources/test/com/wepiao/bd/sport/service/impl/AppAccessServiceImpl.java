package com.wepiao.bd.sport.service.impl;

import com.wepiao.bd.sport.bean.AppAccess;
import com.wepiao.bd.sport.bean.AppAccessCriteria;
import com.wepiao.bd.sport.dao.AppAccessMapper;
import com.wepiao.bd.sport.service.IAppAccessService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppAccessServiceImpl implements IAppAccessService {
    @Autowired
    private AppAccessMapper appAccessMapper;

    private static final Logger logger = LoggerFactory.getLogger(AppAccessServiceImpl.class);

    public Long countByExample(AppAccessCriteria example) {
        long count = this.appAccessMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public AppAccess selectByPrimaryKey(String id) {
        return this.appAccessMapper.selectByPrimaryKey(id);
    }

    public List<AppAccess> selectByExample(AppAccessCriteria example) {
        return this.appAccessMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(String id) {
        return this.appAccessMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(AppAccess record) {
        return this.appAccessMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(AppAccess record) {
        return this.appAccessMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(AppAccessCriteria example) {
        return this.appAccessMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(AppAccess record, AppAccessCriteria example) {
        return this.appAccessMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(AppAccess record, AppAccessCriteria example) {
        return this.appAccessMapper.updateByExample(record, example);
    }

    public int insert(AppAccess record) {
        return this.appAccessMapper.insert(record);
    }

    public int insertSelective(AppAccess record) {
        return this.appAccessMapper.insertSelective(record);
    }
}