package com.nf147.pest.dao;

import com.nf147.pest.entity.PetstoreOrder;
import java.util.List;

public interface PetstoreOrderMapper {
    int deleteByPrimaryKey(Integer or_id);

    int insert(PetstoreOrder record);

    PetstoreOrder selectByPrimaryKey(Integer or_id);

    List<PetstoreOrder> selectAll();

    int updateByPrimaryKey(PetstoreOrder record);
}