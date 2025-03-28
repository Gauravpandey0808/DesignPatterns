package creationalDesignPattern.builderdesignpattern.model;

/**
 *
 * <h3>Builder design pattern</h3>
 * <p>
 *     Builder design pattern is the creational design pattern
 *     used to construct complex objects step by step
 * </p>
 * <p>
 *     The builder design pattern suggests that you extracts all
 *     the object construction code outside of the class and move
 *     it to different objects called builder.
 *     The builder design pattern organizes the construction of object
 *     into step by step process
 * </p>
 *
 */

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
                .setEmail("gaurav3.pandey@gmail.com")
                .build();

        System.out.println("Name of the student is : "+student.getFullName()+
                "\n Roll No of the student is : "+student.getRollNo());
    }
}
