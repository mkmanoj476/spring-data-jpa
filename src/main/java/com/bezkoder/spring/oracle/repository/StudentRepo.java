package com.bezkoder.spring.oracle.repository;

import com.bezkoder.spring.oracle.entity.StudentData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends CrudRepository<StudentData, Integer> {

}
