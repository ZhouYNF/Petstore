package com.nf147.pest.dao;

import com.nf147.pest.entity.Apiresponse;
import java.util.List;

public interface ApiresponseMapper {
    int insert(Apiresponse record);

    List<Apiresponse> selectAll();
}