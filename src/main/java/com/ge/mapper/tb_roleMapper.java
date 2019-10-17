package com.ge.mapper;

import com.ge.pojo.tb_role;
import com.ge.pojo.tb_roleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface tb_roleMapper {
    int countByExample(tb_roleExample example);

    int deleteByExample(tb_roleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(tb_role record);

    int insertSelective(tb_role record);

    List<tb_role> selectByExample(tb_roleExample example);

    tb_role selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") tb_role record, @Param("example") tb_roleExample example);

    int updateByExample(@Param("record") tb_role record, @Param("example") tb_roleExample example);

    int updateByPrimaryKeySelective(tb_role record);

    int updateByPrimaryKey(tb_role record);
}