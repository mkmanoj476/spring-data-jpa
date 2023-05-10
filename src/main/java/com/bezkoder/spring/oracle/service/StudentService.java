package com.bezkoder.spring.oracle.service;

import com.bezkoder.spring.oracle.entity.StudentData;
import com.bezkoder.spring.oracle.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

    @Autowired
   private StudentRepo studentRepo;

    public void addDataservice(StudentData student) {
        studentRepo.save(student);
    }


    public List<StudentData> getStudentData() {
        return (List<StudentData>) studentRepo.findAll();
    }

    public void updateDataservice(int student_id, StudentData student) {
        studentRepo.save(student);
    }

    public void deleteDataservice(int student_id) {
        studentRepo.deleteById(student_id);

    }
}
