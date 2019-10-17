package com.ge.mapper;

import com.ge.pojo.tb_resource;
import com.ge.pojo.tb_resourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface tb_resourceMapper {
    int countByExample(tb_resourceExample example);

    int deleteByExample(tb_resourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(tb_resource record);

    int insertSelective(tb_resource record);

    List<tb_resource> selectByExample(tb_resourceExample example);

    tb_resource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") tb_resource record, @Param("example") tb_resourceExample example);

    int updateByExample(@Param("record") tb_resource record, @Param("example") tb_resourceExample example);

    int updateByPrimaryKeySelective(tb_resource record);

    int updateByPrimaryKey(tb_resource record);
}