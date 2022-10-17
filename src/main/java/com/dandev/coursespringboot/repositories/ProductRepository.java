package com.dandev.coursespringboot.repositories;

import com.dandev.coursespringboot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, Long> {


}
