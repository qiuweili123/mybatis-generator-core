/* github.com/orange1438 */
package com.wepiao.bd.sport.dao;

import com.wepiao.bd.sport.bean.ItemMatchChannel;
import com.wepiao.bd.sport.bean.ItemMatchChannelCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemMatchChannelMapper {
    long countByExample(ItemMatchChannelCriteria example);

    int deleteByExample(ItemMatchChannelCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(ItemMatchChannel record);

    int insertSelective(ItemMatchChannel record);

    List<ItemMatchChannel> selectByExample(ItemMatchChannelCriteria example);

    ItemMatchChannel selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ItemMatchChannel record, @Param("example") ItemMatchChannelCriteria example);

    int updateByExample(@Param("record") ItemMatchChannel record, @Param("example") ItemMatchChannelCriteria example);

    int updateByPrimaryKeySelective(ItemMatchChannel record);

    int updateByPrimaryKey(ItemMatchChannel record);
}