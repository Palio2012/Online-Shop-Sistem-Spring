package com.dandev.coursespringboot.repositories;

import com.dandev.coursespringboot.entities.Order;
import com.dandev.coursespringboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository <Order, Long> {


}
