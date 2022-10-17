package com.dandev.coursespringboot.repositories;

import com.dandev.coursespringboot.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository <Category, Long> {


}
