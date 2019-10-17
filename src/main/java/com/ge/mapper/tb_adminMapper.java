package com.ge.mapper;

import com.ge.pojo.tb_admin;
import com.ge.pojo.tb_adminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface tb_adminMapper {
    int countByExample(tb_adminExample example);

    int deleteByExample(tb_adminExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(tb_admin record);

    int insertSelective(tb_admin record);

    List<tb_admin> selectByExample(tb_adminExample example);

    tb_admin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") tb_admin record, @Param("example") tb_adminExample example);

    int updateByExample(@Param("record") tb_admin record, @Param("example") tb_adminExample example);

    int updateByPrimaryKeySelective(tb_admin record);

    int updateByPrimaryKey(tb_admin record);
}