package model;

import java.time.LocalDate;

public class Student {

    int studentId;
    String name;
    LocalDate dateOfAdmission;

    public Student(int studentId, String name, LocalDate dateOfAdmission) {
        this.studentId = studentId;
        this.name = name;
        this.dateOfAdmission = dateOfAdmission;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public LocalDate getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(LocalDate dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
