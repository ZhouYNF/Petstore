package com.nf147.pest.dao;

import com.nf147.pest.entity.PetstorePet;
import java.util.List;

public interface PetstorePetMapper {
    int deleteByPrimaryKey(Integer pet_id);

    int insert(PetstorePet record);

    PetstorePet selectByPrimaryKey(Integer pet_id);

    List<PetstorePet> selectAll();

    int updateByPrimaryKey(PetstorePet record);
}