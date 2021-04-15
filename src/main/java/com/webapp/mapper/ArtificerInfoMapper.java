package com.webapp.mapper;

import com.webapp.model.ArtificerInfo;
import com.webapp.model.ArtificerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArtificerInfoMapper {
    int countByExample(ArtificerInfoExample example);

    int deleteByExample(ArtificerInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(ArtificerInfo record);

    int insertSelective(ArtificerInfo record);

    List<ArtificerInfo> selectByExample(ArtificerInfoExample example);

    ArtificerInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ArtificerInfo record, @Param("example") ArtificerInfoExample example);

    int updateByExample(@Param("record") ArtificerInfo record, @Param("example") ArtificerInfoExample example);

    int updateByPrimaryKeySelective(ArtificerInfo record);

    int updateByPrimaryKey(ArtificerInfo record);
}