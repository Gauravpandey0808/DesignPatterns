package Revision.builderDesignPattern;

import java.util.Optional;

public class StudentBuilder {

    private String name;
    private  Integer studentClass;
    private String fatherName;
    private String motherName;
    private Integer age;

    public String getName() {
        return name;
    }

    public int getStudentClass() {
        return studentClass;
    }

    public String getFatherName() {
        return fatherName;
    }

    public Optional<String> getMotherName() {
        return Optional.of(motherName);
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

    private Integer rollNo;
    private String address;

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setStudentClass(int studentClass) {
        this.studentClass = studentClass;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public StudentBuilder setAge(Integer age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public StudentBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Student build() {
        return new Student(this);
    }

}
