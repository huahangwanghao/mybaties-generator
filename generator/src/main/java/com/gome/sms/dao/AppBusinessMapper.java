package com.gome.sms.dao;

import com.gome.sms.model.AppBusiness;
import com.gome.sms.model.AppBusinessCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppBusinessMapper {
    int countByExample(AppBusinessCriteria example);

    int deleteByExample(AppBusinessCriteria example);

    int deleteByPrimaryKey(String CUSTOMER_APPLY_CODE);

    int insert(AppBusiness record);

    int insertSelective(AppBusiness record);

    List<AppBusiness> selectByExample(AppBusinessCriteria example);

    AppBusiness selectByPrimaryKey(String CUSTOMER_APPLY_CODE);

    int updateByExampleSelective(@Param("record") AppBusiness record, @Param("example") AppBusinessCriteria example);

    int updateByExample(@Param("record") AppBusiness record, @Param("example") AppBusinessCriteria example);

    int updateByPrimaryKeySelective(AppBusiness record);

    int updateByPrimaryKey(AppBusiness record);
}