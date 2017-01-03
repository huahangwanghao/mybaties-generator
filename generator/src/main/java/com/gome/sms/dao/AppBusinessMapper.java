package com.gome.sms.dao;

import com.gome.sms.model.AppBusiness;

public interface AppBusinessMapper {
    int deleteByPrimaryKey(String customerApplyCode);

    int insert(AppBusiness record);

    int insertSelective(AppBusiness record);

    AppBusiness selectByPrimaryKey(String customerApplyCode);

    int updateByPrimaryKeySelective(AppBusiness record);

    int updateByPrimaryKey(AppBusiness record);
}