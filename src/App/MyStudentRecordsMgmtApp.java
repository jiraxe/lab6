package App;

import model.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MyStudentRecordsMgmtApp {
    static Student[] stuArr;
    public static void main(String[] args) {
        stuArr = new Student[5];
        stuArr[0] = new Student(110001,"Dave", LocalDate.of(1951 , 11,18));
        stuArr[1] = new Student(110001,"Anna", LocalDate.of(1990 , 12,7));
        stuArr[2] = new Student(110001,"Erica", LocalDate.of(1974 , 1,31));
        stuArr[3] = new Student(110001,"Carlos", LocalDate.of(2009 , 8,22));
        stuArr[4] = new Student(110001,"Bob", LocalDate.of(1990 , 3,5));
        printListOfStudents(stuArr);
        System.out.println();
        getListOfPlatinumAlumniStudents(stuArr);
    }
    static class comp implements Comparator<Student>{
        @Override
        public int compare(Student s, Student t) {
            return s.getName().compareTo(t.getName());
        }
    }
    static void printListOfStudents(Student[] stuList){
        Arrays.sort(stuList, new comp());
        for (Student s : stuList) {
            System.out.println("Name: " + s.getName() + " ID: " + s.getStudentId()
            + " DOA: " + s.getDateOfAdmission().toString());
        }
    }
    static Student[] getListOfPlatinumAlumniStudents(Student[] stuList){
        Student[] res = new Student[stuList.length];
        int i = 0;
        for (Student s : stuList) {
            if(s.getDateOfAdmission().isBefore(LocalDate.of(1990, 3, 3))) {
                res[i++] = s;
                System.out.println("Name: " + s.getName() + " ID: " + s.getStudentId()
                        + " DOA: " + s.getDateOfAdmission().toString());
            }
        }
        return res;
    }
}
