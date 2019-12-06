package com.xdkj.dao;
import java.math.BigDecimal;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Date;

import com.xdkj.bean.Emp;

/**
@Author guo
@create 2019-12-06 10:51
*/
public interface EmpMapper {
    int deleteByPrimaryKey(Short empno);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Short empno);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);

   List<Emp> selectByAll(Emp emp);




}