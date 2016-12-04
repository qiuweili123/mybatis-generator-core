/* github.com/orange1438 */
package com.wepiao.bd.sport.dao;

import com.wepiao.bd.sport.bean.ItemPuboff;
import com.wepiao.bd.sport.bean.ItemPuboffCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemPuboffMapper {
    long countByExample(ItemPuboffCriteria example);

    int deleteByExample(ItemPuboffCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(ItemPuboff record);

    int insertSelective(ItemPuboff record);

    List<ItemPuboff> selectByExample(ItemPuboffCriteria example);

    ItemPuboff selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ItemPuboff record, @Param("example") ItemPuboffCriteria example);

    int updateByExample(@Param("record") ItemPuboff record, @Param("example") ItemPuboffCriteria example);

    int updateByPrimaryKeySelective(ItemPuboff record);

    int updateByPrimaryKey(ItemPuboff record);
}