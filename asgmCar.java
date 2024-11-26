import java.text.DecimalFormat;

public class asgmCar {
    public static void main(String[]args){
        int manufacturesYear=5;
        String carName="Toyota";
        double carPrice=103660;
        double amount=manufacturesYear*carPrice;
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("The car name is "+carName+" and it worth RM"+df.format(carPrice));
        System.out.println("It has been bought for "+manufacturesYear+" year");
        System.out.println("The total amount is RM"+df.format(amount));
    }
}
