/* github.com/orange1438 */
package com.wepiao.bd.sport.dao;

import com.wepiao.bd.sport.bean.ItemPubon;
import com.wepiao.bd.sport.bean.ItemPubonCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemPubonMapper {
    long countByExample(ItemPubonCriteria example);

    int deleteByExample(ItemPubonCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(ItemPubon record);

    int insertSelective(ItemPubon record);

    List<ItemPubon> selectByExample(ItemPubonCriteria example);

    ItemPubon selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ItemPubon record, @Param("example") ItemPubonCriteria example);

    int updateByExample(@Param("record") ItemPubon record, @Param("example") ItemPubonCriteria example);

    int updateByPrimaryKeySelective(ItemPubon record);

    int updateByPrimaryKey(ItemPubon record);
}