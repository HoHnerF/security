package com.ge.mapper;

import com.ge.pojo.tb_admin_roleExample;
import com.ge.pojo.tb_admin_roleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface tb_admin_roleMapper {
    int countByExample(tb_admin_roleExample example);

    int deleteByExample(tb_admin_roleExample example);

    int deleteByPrimaryKey(tb_admin_roleKey key);

    int insert(tb_admin_roleKey record);

    int insertSelective(tb_admin_roleKey record);

    List<tb_admin_roleKey> selectByExample(tb_admin_roleExample example);

    int updateByExampleSelective(@Param("record") tb_admin_roleKey record, @Param("example") tb_admin_roleExample example);

    int updateByExample(@Param("record") tb_admin_roleKey record, @Param("example") tb_admin_roleExample example);
}