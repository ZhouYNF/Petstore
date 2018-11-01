package com.nf147.pest.dao;

import com.nf147.pest.entity.PetstoreUser;
import java.util.List;

public interface PetstoreUserMapper {
    int deleteByPrimaryKey(Integer user_id);

    int insert(PetstoreUser record);

    PetstoreUser selectByPrimaryKey(Integer user_id);

    List<PetstoreUser> selectAll();

    int updateByPrimaryKey(PetstoreUser record);
}