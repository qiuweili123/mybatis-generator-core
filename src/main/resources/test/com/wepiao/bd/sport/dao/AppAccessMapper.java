/* github.com/orange1438 */
package com.wepiao.bd.sport.dao;

import com.wepiao.bd.sport.bean.AppAccess;
import com.wepiao.bd.sport.bean.AppAccessCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppAccessMapper {
    long countByExample(AppAccessCriteria example);

    int deleteByExample(AppAccessCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(AppAccess record);

    int insertSelective(AppAccess record);

    List<AppAccess> selectByExample(AppAccessCriteria example);

    AppAccess selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AppAccess record, @Param("example") AppAccessCriteria example);

    int updateByExample(@Param("record") AppAccess record, @Param("example") AppAccessCriteria example);

    int updateByPrimaryKeySelective(AppAccess record);

    int updateByPrimaryKey(AppAccess record);
}