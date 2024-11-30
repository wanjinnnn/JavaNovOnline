import java.util.Scanner;

class Car{
    private int year;
    private double price;
    private String name;

    public Car(String name, int year, double price){
        this.name=name;
        this.year=year;
        this.price=price;
    }

    public String getModel(){
        return name;
    }

    public int getYear(){
        return year;
    }

    public double getPrice(){
        return price;
    }
    
    public  double calculatePrice(){
        return price*year;
    }
}

public class carPrice{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String model;
        int year=0;
        double price=0;
        double totalAmount=0;
        double averageAmount;
        System.out.println("Enter details for 3 cars:");
        for (int i=1;i<=3;i++){
            System.out.println("Car "+i+":");
            System.out.print("Enter car model: ");
            model=input.nextLine();
            System.out.print("Enter car manufacture year: ");
            year = input.nextInt();
            System.out.print("Enter car price: ");
            price = input.nextDouble();
            input.nextLine();
            double carTotalPrice=year*price;
            totalAmount+=carTotalPrice;
            System.out.printf("RM%.2f",carTotalPrice);
            System.out.print("\n");
        }
        averageAmount=totalAmount/3;
        System.out.printf("The average prices of the cars is RM%.2f" ,averageAmount);
    }
}
