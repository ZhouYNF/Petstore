package com.nf147.pest.dao;

import com.nf147.pest.entity.Order;
import java.util.List;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer or_id);

    int insert(Order record);

    Order selectByPrimaryKey(Integer or_id);

    List<Order> selectAll();

    int updateByPrimaryKey(Order record);
}