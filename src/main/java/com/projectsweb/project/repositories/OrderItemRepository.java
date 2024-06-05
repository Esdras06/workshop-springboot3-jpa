package com.projectsweb.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectsweb.project.entities.OrderItem;
import com.projectsweb.project.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
