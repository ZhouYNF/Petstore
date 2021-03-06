package com.nf147.pest.dao;

import com.nf147.pest.entity.Tag;
import java.util.List;

public interface TagMapper {
    int deleteByPrimaryKey(Integer tag_id);

    int insert(Tag record);

    Tag selectByPrimaryKey(Integer tag_id);

    List<Tag> selectAll();

    int updateByPrimaryKey(Tag record);
}