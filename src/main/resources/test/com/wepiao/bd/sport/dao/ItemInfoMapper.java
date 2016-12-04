/* github.com/orange1438 */
package com.wepiao.bd.sport.dao;

import com.wepiao.bd.sport.bean.ItemInfo;
import com.wepiao.bd.sport.bean.ItemInfoCriteria;
import com.wepiao.bd.sport.bean.ItemInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemInfoMapper {
    long countByExample(ItemInfoCriteria example);

    int deleteByExample(ItemInfoCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(ItemInfoWithBLOBs record);

    int insertSelective(ItemInfoWithBLOBs record);

    List<ItemInfoWithBLOBs> selectByExampleWithBLOBs(ItemInfoCriteria example);

    List<ItemInfo> selectByExample(ItemInfoCriteria example);

    ItemInfoWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ItemInfoWithBLOBs record, @Param("example") ItemInfoCriteria example);

    int updateByExampleWithBLOBs(@Param("record") ItemInfoWithBLOBs record, @Param("example") ItemInfoCriteria example);

    int updateByExample(@Param("record") ItemInfo record, @Param("example") ItemInfoCriteria example);

    int updateByPrimaryKeySelective(ItemInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ItemInfoWithBLOBs record);

    int updateByPrimaryKey(ItemInfo record);
}