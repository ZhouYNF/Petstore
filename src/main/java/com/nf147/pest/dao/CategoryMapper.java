package com.nf147.pest.dao;

import com.nf147.pest.entity.Category;
import java.util.List;

public interface CategoryMapper {
    int deleteByPrimaryKey(Integer cg_id);

    int insert(Category record);

    Category selectByPrimaryKey(Integer cg_id);

    List<Category> selectAll();

    int updateByPrimaryKey(Category record);
}