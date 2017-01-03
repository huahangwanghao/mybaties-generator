package com.gome.sms.dao;

import com.gome.sms.model.AppBusinessProduct;

public interface AppBusinessProductMapper {
    int insert(AppBusinessProduct record);

    int insertSelective(AppBusinessProduct record);
}