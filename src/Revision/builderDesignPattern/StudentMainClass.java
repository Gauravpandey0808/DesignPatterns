package Revision.builderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class StudentMainClass {
    public static void main(String[] args) {
        StudentBuilder builder = new StudentBuilder();
        Student student = builder.setName("Gaurav")
                .setStudentClass(12)
                .setMotherName("Kamla")
                .setFatherName("Prakash")
                .setAge(null)
                .setRollNo(null)
                .setAddress("Link Road Pithoragarh")
                .build();

        Student student2 = builder.setName("Sachin")
                .setStudentClass(12)
                .setMotherName("Sartaj")
                .setFatherName("Parmila")
                .setAge(18)
                .setRollNo(25)
                .setAddress("Link Road Pithoragarh")
                .build();

        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student2);

        System.out.println(student.getAge().orElse(-1));
    }
}
