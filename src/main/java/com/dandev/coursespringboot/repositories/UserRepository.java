package com.dandev.coursespringboot.repositories;

import com.dandev.coursespringboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {


}
