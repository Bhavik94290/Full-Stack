package com.bhavik.fullstack_backend.repository;

import com.bhavik.fullstack_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {


}
