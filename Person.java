import java.text.DecimalFormat;

public class Person {

    public static void main(String[] args) {
        String name = "Jin";
        int age = 22;
        double height = 1.66;
        double weight = 52;
        double bmi = weight/(height*height);
        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println("The student name is " + name + " and age is " + age);
        System.out.println("The student height is " + height + " m and the weight is " + weight + " kg");
        System.out.println("The student bmi is " + df.format(bmi) );
    }
}
