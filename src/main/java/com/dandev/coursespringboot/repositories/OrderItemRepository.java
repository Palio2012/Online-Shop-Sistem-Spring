package com.dandev.coursespringboot.repositories;

import com.dandev.coursespringboot.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository <OrderItem, Long> {


}
