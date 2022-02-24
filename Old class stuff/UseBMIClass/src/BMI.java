public class BMI {

    private String name;
    private int age;
    private double weight;
    private double height;
    //Why are the above variables private?  What changes if they are public?
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH =  0.0254;

    public BMI(String name, int age, double weight, double height) {    //this is a constructor
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        // I still don't understand the significance of the "this" keyword.
        // It keeps Java from getting confused for some reason, but I'm not sure why...
    }

    public BMI(String name, double weight, double height) {  // Should this method have the age variable? Mistake?
        this(name, 20, weight, height);            //why is the 20 here? age? how does Java know?
                                                        //why is "this" used here?
    }

    public double getBMI(){
        double bmi = weight * KILOGRAMS_PER_POUND /((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
        return Math.round(bmi * 100) / 100.0;
    }

    public String getStatus(){
        double bmi = getBMI();
        if(bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getWeight(){
        return weight;
    }

    public double getHeight(){
        return height;
    }

}
