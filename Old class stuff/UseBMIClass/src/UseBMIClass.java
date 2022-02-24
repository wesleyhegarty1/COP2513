public class UseBMIClass {
    public static void main(String[] args) {

        BMI bmi1 = new BMI("Kim Yang", 18, 145, 70);                // Object is created
        System.out.println("The BMI for " + bmi1.getName() + " is " // Instance method
            + bmi1.getBMI() + " " + bmi1.getStatus());

        BMI bmi2 = new BMI("Susan King", 215, 70);
        System.out.println("The BMI for " + bmi2.getName() + " is "
            + bmi2.getBMI() + " " + bmi2.getStatus());

    }
}

/**
 * In BMI.java, what difference would have been made if those private variables had
 *     been made public?
 *
 * On lines 4 & 8, what does the first instance of BMI do?  Is this just pointing Java
 *     to where it needs to get the data from.  As in, which class to look to get the needed data?
 *
 * What is the difference between an "Instance method" and a regular method?
 *
 *
 *
 */