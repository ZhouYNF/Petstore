package com.nf147.pest.dao;

import com.nf147.pest.entity.PetstoreApiresponse;
import java.util.List;

public interface PetstoreApiresponseMapper {
    int insert(PetstoreApiresponse record);

    List<PetstoreApiresponse> selectAll();
}