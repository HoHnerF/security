package com.ge.mapper;

import com.ge.pojo.tb_resource_menuExample;
import com.ge.pojo.tb_resource_menuKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface tb_resource_menuMapper {
    int countByExample(tb_resource_menuExample example);

    int deleteByExample(tb_resource_menuExample example);

    int deleteByPrimaryKey(tb_resource_menuKey key);

    int insert(tb_resource_menuKey record);

    int insertSelective(tb_resource_menuKey record);

    List<tb_resource_menuKey> selectByExample(tb_resource_menuExample example);

    int updateByExampleSelective(@Param("record") tb_resource_menuKey record, @Param("example") tb_resource_menuExample example);

    int updateByExample(@Param("record") tb_resource_menuKey record, @Param("example") tb_resource_menuExample example);
}