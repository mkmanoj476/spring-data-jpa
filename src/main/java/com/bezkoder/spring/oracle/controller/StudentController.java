package com.bezkoder.spring.oracle.controller;

import com.bezkoder.spring.oracle.entity.StudentData;
import com.bezkoder.spring.oracle.service.StudentService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("students")
    public List<StudentData> getStudentData(){
        return studentService.getStudentData();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/student")
    public void addstudentdata(@RequestBody StudentData student){
        studentService.addDataservice(student);
    }

    @PutMapping("/studentupdate/{student_id}")
    public void updatestudentdata(@PathVariable int student_id, @RequestBody StudentData student){
        studentService.updateDataservice(student_id, student);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/student/{student_id}")
    public void deletetudentdata(@PathVariable int student_id){
        studentService.deleteDataservice(student_id);
    }
}
