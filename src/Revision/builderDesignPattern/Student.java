package Revision.builderDesignPattern;

import java.util.Optional;

public class Student {

    private final String name;
    private final Integer studentClass;
    private final String fatherName;
    private final String motherName;
    private final Integer age;
    private final Integer rollNo;
    private final String address;

    public String getName() {
        return name;
    }

    public int getStudentClass() {
        return studentClass;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public Optional<Integer> getAge() {
        return Optional.ofNullable(age);
    }

    public Optional<Integer> getRollNo() {
        return Optional.ofNullable(rollNo);
    }

    public Optional<String> getAddress() {
        return Optional.ofNullable(address);
    }

    public Student(StudentBuilder studentBuilder) {
        this.name = studentBuilder.getName();
        this.studentClass = studentBuilder.getStudentClass();
        this.fatherName = studentBuilder.getFatherName();
        this.motherName = studentBuilder.getMotherName().orElseGet(null);
        this.age = studentBuilder.getAge().orElseGet(()-> null);
        this.rollNo = studentBuilder.getRollNo().orElseGet(()-> null);
        this.address = studentBuilder.getAddress().orElseGet(() -> null);
    }
}
