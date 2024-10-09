package creationalDesignPattern.builderdesignpattern.model;

import lombok.Getter;

@Getter
public class Student {
    private final String fullName;
    private final String standard;
    private final String rollNo;
    private final String email;

    Student(StudentBuilder studentBuilder) {
        this.fullName = studentBuilder.fullName;
        this.standard = studentBuilder.standard;
        this.rollNo = studentBuilder.rollNo;
        this.email = studentBuilder.email;
    }

    public static StudentBuilderFullName builder() {
        return new StudentBuilderFullName();
    }

    public static class StudentBuilderFullName {
        public String fullName;

        public StudentBuilderStandard setFullName(String fullName) {
            this.fullName = fullName;
            return new StudentBuilderStandard(this);
        }


    }

    public static class StudentBuilderStandard {

        public final String fullName;
        public String standard;

        StudentBuilderStandard(StudentBuilderFullName studentBuilderFullName) {
            this.fullName = studentBuilderFullName.fullName;
        }

        public StudentBuilderRollNo setStandard(String standard) {
            this.standard = standard;
            return new StudentBuilderRollNo(this);
        }

    }

    public static class StudentBuilderRollNo {
        private final String fullName;
        private final String standard;
        private  String rollNo;

        StudentBuilderRollNo(StudentBuilderStandard studentBuilderStandard) {
            this.fullName = studentBuilderStandard.fullName;
            this.standard = studentBuilderStandard.standard;
        }

        public StudentBuilderEmail setRollNo(String rollNo) {
            this.rollNo = rollNo;
            return new StudentBuilderEmail(this);
        }

    }

    public static class StudentBuilderEmail {
        private final String fullName;
        private final String standard;
        private final String rollNo;
        private String email;

        StudentBuilderEmail(StudentBuilderRollNo studentBuilderRollNo) {
            this.fullName = studentBuilderRollNo.fullName;
            this.standard = studentBuilderRollNo.standard;
            this.rollNo = studentBuilderRollNo.rollNo;
        }

        public StudentBuilder setEmail(String email) {
            this.email = email;
            return new StudentBuilder(this);
        }

    }

    public static class StudentBuilder {
        private final String fullName;
        private final String standard;
        private final String rollNo;
        private final String email;

        StudentBuilder(StudentBuilderEmail studentBuilderEmail) {
            this.fullName = studentBuilderEmail.fullName;
            this.email = studentBuilderEmail.email;
            this.rollNo = studentBuilderEmail.rollNo;
            this.standard = studentBuilderEmail.standard;
        }

        public Student build() {
            return new Student(this);
        }

    }



}
