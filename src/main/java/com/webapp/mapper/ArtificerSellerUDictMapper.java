package com.webapp.mapper;

import com.webapp.model.ArtificerSellerUDict;
import com.webapp.model.ArtificerSellerUDictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArtificerSellerUDictMapper {
    int countByExample(ArtificerSellerUDictExample example);

    int deleteByExample(ArtificerSellerUDictExample example);

    int deleteByPrimaryKey(String id);

    int insert(ArtificerSellerUDict record);

    int insertSelective(ArtificerSellerUDict record);

    List<ArtificerSellerUDict> selectByExample(ArtificerSellerUDictExample example);

    ArtificerSellerUDict selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ArtificerSellerUDict record, @Param("example") ArtificerSellerUDictExample example);

    int updateByExample(@Param("record") ArtificerSellerUDict record, @Param("example") ArtificerSellerUDictExample example);

    int updateByPrimaryKeySelective(ArtificerSellerUDict record);

    int updateByPrimaryKey(ArtificerSellerUDict record);
}