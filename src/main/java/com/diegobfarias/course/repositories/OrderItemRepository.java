package com.diegobfarias.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegobfarias.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	
}
