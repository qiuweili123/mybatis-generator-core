/* github.com/orange1438 */
package com.wepiao.bd.sport.dao;

import com.wepiao.bd.sport.bean.ItemScreenings;
import com.wepiao.bd.sport.bean.ItemScreeningsCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemScreeningsMapper {
    long countByExample(ItemScreeningsCriteria example);

    int deleteByExample(ItemScreeningsCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(ItemScreenings record);

    int insertSelective(ItemScreenings record);

    List<ItemScreenings> selectByExample(ItemScreeningsCriteria example);

    ItemScreenings selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ItemScreenings record, @Param("example") ItemScreeningsCriteria example);

    int updateByExample(@Param("record") ItemScreenings record, @Param("example") ItemScreeningsCriteria example);

    int updateByPrimaryKeySelective(ItemScreenings record);

    int updateByPrimaryKey(ItemScreenings record);
}