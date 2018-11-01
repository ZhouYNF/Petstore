package com.nf147.pest.dao;

import com.nf147.pest.entity.PetstoreCategory;
import java.util.List;

public interface PetstoreCategoryMapper {
    int deleteByPrimaryKey(Integer cg_id);

    int insert(PetstoreCategory record);

    PetstoreCategory selectByPrimaryKey(Integer cg_id);

    List<PetstoreCategory> selectAll();

    int updateByPrimaryKey(PetstoreCategory record);
}