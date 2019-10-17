package com.ge.mapper;

import com.ge.pojo.tb_role_resourceExample;
import com.ge.pojo.tb_role_resourceKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface tb_role_resourceMapper {
    int countByExample(tb_role_resourceExample example);

    int deleteByExample(tb_role_resourceExample example);

    int deleteByPrimaryKey(tb_role_resourceKey key);

    int insert(tb_role_resourceKey record);

    int insertSelective(tb_role_resourceKey record);

    List<tb_role_resourceKey> selectByExample(tb_role_resourceExample example);

    int updateByExampleSelective(@Param("record") tb_role_resourceKey record, @Param("example") tb_role_resourceExample example);

    int updateByExample(@Param("record") tb_role_resourceKey record, @Param("example") tb_role_resourceExample example);
}