import java.util.Scanner;

public class assignment5 {
    public static void main(String[] args) {
        //Use scanner to get the prices of the 5 different cars from the terminal and if the value of the car is equal or above 70000 RM, put them in the matrix of 22 which shows the value, "VIP", "2024", "pre-order" and if the value is below the 70000 put them in the matrix of 22 which shows the value, "Cheap", "old", "for sale"
        String [][] matrixVIP=new String[5][4];
        String [][] matrixCheap=new String[5][4];
        double price=0;
        Scanner scanner=new Scanner(System.in);

        for(int i=0;i<5;i++){
            System.out.print("Please input the price of the car "+(i+1)+":");
            price=scanner.nextInt();
            if (price>=70000){
                String price2=Double.toString(price);
                matrixVIP[i][0]=price2;matrixVIP[i][1]="VIP";matrixVIP[i][2]="2024";matrixVIP[i][3]="pre-order";
            }
            else{
                String price2=Double.toString(price);
                matrixCheap[i][0]=price2;matrixCheap[i][1]="Cheap";matrixCheap[i][2]="old";matrixCheap[i][3]="for sale";
            }
        }

        System.out.print("\nCars in VIP category:");
        boolean hasVIPCars = false;
        for (int i=0;i<5;i++) {
            if(matrixVIP[i][0]!=null){
                hasVIPCars = true;
                System.out.print("\n");
                for(int j=0;j<4;j++){
                    System.out.print(matrixVIP[i][j]+" ");
                }
            }
        }
        if (!hasVIPCars) {
            System.out.println("\nNo VIP cars available.");
        }

        System.out.print("\n\nCars in Cheap category:");
        boolean hasCheapCars = false;
        for (int i=0;i<5;i++) {
            if(matrixCheap[i][0]!=null){
                System.out.print("\n");
                for(int j=0;j<4;j++){
                    System.out.print(matrixCheap[i][j]+" ");
                }
            }
        }
        if (!hasCheapCars) {
            System.out.println("\nNo cheap cars available.");
        }

        scanner.close();
    }
}
