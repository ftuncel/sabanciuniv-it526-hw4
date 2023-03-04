package edu.sabanciuniv.ferhattuncelhw4.repository;

import edu.sabanciuniv.ferhattuncelhw4.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
