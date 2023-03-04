package edu.sabanciuniv.ferhattuncelhw4.initilize;

import edu.sabanciuniv.ferhattuncelhw4.model.Student;
import edu.sabanciuniv.ferhattuncelhw4.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.Month;

@Component
@RequiredArgsConstructor
@Slf4j
public class TestDataInitializer implements CommandLineRunner {

    private final static Logger logger = LoggerFactory.getLogger(TestDataInitializer.class);

    private final StudentRepository studentRepository;
    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (studentRepository.count() == 0) {
            Student student1 = new Student("Ferhat Tuncel", "05.08.1988", "İstanbul", "E");
            Student student2 = new Student("Duygu Tuncel", "01.01.1988", "İstanbul", "K");
            Student student3 = new Student("Uzay Tuncel", "02.02.2020", "İstanbul", "E");
            Student student4 = new Student("Onur Tuncel", "03.03.1992", "Bursa", "E");
            Student student5 = new Student("Tugce Tuncel", "04.04.1992", "Bursa", "K");

            studentRepository.save(student1);
            studentRepository.save(student2);
            studentRepository.save(student3);
            studentRepository.save(student4);
            studentRepository.save(student5);

            logger.info("Initial data saved!");
        }
    }
}