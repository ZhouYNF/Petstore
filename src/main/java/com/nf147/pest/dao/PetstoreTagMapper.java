package com.nf147.pest.dao;

import com.nf147.pest.entity.PetstoreTag;
import java.util.List;

public interface PetstoreTagMapper {
    int deleteByPrimaryKey(Integer tag_id);

    int insert(PetstoreTag record);

    PetstoreTag selectByPrimaryKey(Integer tag_id);

    List<PetstoreTag> selectAll();

    int updateByPrimaryKey(PetstoreTag record);
}