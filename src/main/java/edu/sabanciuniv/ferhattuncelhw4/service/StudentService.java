package edu.sabanciuniv.ferhattuncelhw4.service;

import edu.sabanciuniv.ferhattuncelhw4.model.Student;
import edu.sabanciuniv.ferhattuncelhw4.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student addNewStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student updateExistingStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteExistingStudent(Student student) {
        studentRepository.delete(student);
    }

    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }
}
