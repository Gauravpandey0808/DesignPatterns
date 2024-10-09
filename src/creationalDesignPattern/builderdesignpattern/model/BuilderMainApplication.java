package creationalDesignPattern.builderdesignpattern.model;

public class BuilderMainApplication {

    public static void main(String[] args) {

        User user = User.builder()
                .setName("Gaurav")
                .setPhoneNumber("63********")
                .setUserId("sdfjcsdudfcsducedceudsdc")
                .setEmail("1996.gaurav.*****@gmail.com")
                .build();
        System.out.println("The email id is : "+user.getEmail());
        System.out.println("The name of the user is : "+user.getName());


//     ------------------------------------------------------------------------

        Student student = Student.builder()
                .setFullName("Gaurav Pandey")
                .setStandard("Btech")
                .setRollNo("30")
                .setEmail("1123")
                .build();

        System.out.println("Name of the student is : "+student.getFullName()+
                "\n Roll No of the student is : "+student.getRollNo());
    }
}
