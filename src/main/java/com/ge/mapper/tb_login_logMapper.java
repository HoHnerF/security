package com.ge.mapper;

import com.ge.pojo.tb_login_log;
import com.ge.pojo.tb_login_logExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface tb_login_logMapper {
    int countByExample(tb_login_logExample example);

    int deleteByExample(tb_login_logExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(tb_login_log record);

    int insertSelective(tb_login_log record);

    List<tb_login_log> selectByExample(tb_login_logExample example);

    tb_login_log selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") tb_login_log record, @Param("example") tb_login_logExample example);

    int updateByExample(@Param("record") tb_login_log record, @Param("example") tb_login_logExample example);

    int updateByPrimaryKeySelective(tb_login_log record);

    int updateByPrimaryKey(tb_login_log record);
}