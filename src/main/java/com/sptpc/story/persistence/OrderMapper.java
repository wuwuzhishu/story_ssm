package com.sptpc.story.persistence;

import org.springframework.stereotype.Repository;

import com.sptpc.story.domain.Orders;


@Repository
public interface OrderMapper {

	int insertProduct(Orders order);

}
