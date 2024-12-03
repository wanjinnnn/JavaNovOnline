import java.text.DecimalFormat;
import java.util.Scanner;

public class assignment8 {
    private static String name;
    private static int age;
    private static double height;
    private static double weight;
    private static double bmi;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height=height;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        this.weight=weight;
    }
    
    public double getBMI(){
        return bmi;
    }

    public void setBMI(double bmi){
        DecimalFormat df=new DecimalFormat("0.00");
        this.bmi=Double.valueOf(df.format(bmi));
    }

    public static void main(String[] args) {
        /*Pass the person age and name and hight and weight using scanner, use the encapsulation to have set and get data and use the following formula to calculate bmi: (height-100)/weight
        The final result in console must be the following:
        The person name is ${genrated_name} and he/she is ${generated_age} years old and his/her bmi is ${calculated_value_of_bmi}*/
        Scanner scanner=new Scanner(System.in);
        assignment8 person=new assignment8();
        System.out.print("Please insert your name: ");
        name=scanner.next();
        System.out.print("Please input your age: ");
        age=scanner.nextInt();
        System.out.print("Please input your height in cm: ");
        height=scanner.nextDouble();
        System.out.print("Please input your weight: ");
        weight=scanner.nextDouble();
        double calculatedBMI = (person.getHeight() - 100) / person.getWeight();
        person.setBMI(calculatedBMI);
        person.setName(name);
        person.setAge(age);
        person.setHeight(height);
        person.setWeight(weight);
        person.setBMI(bmi);
        System.out.println("The person name is "+person.getName()+" and he/she is "+person.getAge()+" years old and his/her bmi is "+person.getBMI()+".");
        scanner.close();
    }
}
