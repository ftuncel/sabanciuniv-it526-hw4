package edu.sabanciuniv.ferhattuncelhw4.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
public class Student {
    // variables
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String studentName;
    private String studentBirthDate;
    private String studentAddress;
    private String studentGender;

    // CTORs
    public Student(String studentName, String studentBirthDate, String studentAddress, String studentGender) {
        this.studentName = studentName;
        this.studentBirthDate = studentBirthDate;
        this.studentAddress = studentAddress;
        this.studentGender = studentGender;
    }

    public Student() {
    }

    // getter and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentBirthDate() {
        return studentBirthDate;
    }

    public void setStudentBirthDate(String studentBirthDate) {
        this.studentBirthDate = studentBirthDate;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }


    // custom methods


    // overwrite methods
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentBirthDate='" + studentBirthDate + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", studentGender='" + studentGender + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(studentName, student.studentName) && Objects.equals(studentBirthDate, student.studentBirthDate) && Objects.equals(studentAddress, student.studentAddress) && Objects.equals(studentGender, student.studentGender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, studentName, studentBirthDate, studentAddress, studentGender);
    }
}
