package com.bezkoder.spring.oracle.repository;

import com.bezkoder.spring.oracle.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

}
