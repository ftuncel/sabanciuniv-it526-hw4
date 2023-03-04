package edu.sabanciuniv.ferhattuncelhw4.controller;

import edu.sabanciuniv.ferhattuncelhw4.model.Student;
import edu.sabanciuniv.ferhattuncelhw4.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudent(){
        return studentService.getAllStudents();
    }

    @RequestMapping(value = "/students/{id}")
    public Optional<Student> getUser(@PathVariable Long id) {
        return studentService.findById(id);
    }

    @PostMapping("/students")
    public Student addNewStudent(@RequestBody Student student){
        return studentService.addNewStudent(student);
    }

    @PutMapping("/students")
    public Student updateExistingStudent(@RequestBody Student student){
        return studentService.updateExistingStudent(student);
    }

    @DeleteMapping("/students")
    public void deleteExistingStudent(@RequestBody Student student){
        studentService.deleteExistingStudent(student);
    }
}
