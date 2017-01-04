package com.gome.sms.dao;

import com.gome.sms.model.AppBusiness;
import com.gome.sms.model.AppBusinessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppBusinessMapper {
    int countByExample(AppBusinessExample example);

    int deleteByExample(AppBusinessExample example);

    int deleteByPrimaryKey(String customerApplyCode);

    int insert(AppBusiness record);

    int insertSelective(AppBusiness record);

    List<AppBusiness> selectByExample(AppBusinessExample example);

    AppBusiness selectByPrimaryKey(String customerApplyCode);

    int updateByExampleSelective(@Param("record") AppBusiness record, @Param("example") AppBusinessExample example);

    int updateByExample(@Param("record") AppBusiness record, @Param("example") AppBusinessExample example);

    int updateByPrimaryKeySelective(AppBusiness record);

    int updateByPrimaryKey(AppBusiness record);
}