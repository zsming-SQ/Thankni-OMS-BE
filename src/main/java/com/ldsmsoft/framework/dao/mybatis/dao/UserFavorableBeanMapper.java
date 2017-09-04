package com.ldsmsoft.framework.dao.mybatis.dao;

import com.ldsmsoft.framework.dao.mybatis.model.UserFavorableBean;

public interface UserFavorableBeanMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserFavorableBean record);

    int insertSelective(UserFavorableBean record);

    UserFavorableBean selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserFavorableBean record);

    int updateByPrimaryKey(UserFavorableBean record);
}