import java.util.Scanner;

public class assignment4 {
    public static void main(String[] args) {
        //Create a Matrix with 3 rows and 3 columns which contains the car models and prices then fetch the car which values above 50,000 RM and portray it in the terminal
        String [][]  matrix=new String[3][3];
        Scanner scanner=new Scanner(System.in);
        int p=1;

        for(int i=0;i<matrix.length;i++){
            System.out.println("Please enter the car detail of car "+(i+1));
            System.out.print("Enter car model: ");
            matrix[i][0] = scanner.nextLine(); 
            System.out.print("Enter car made: ");
            matrix[i][1] = scanner.nextLine(); 
            System.out.print("Enter car price: ");
            matrix[i][2] = scanner.nextLine();
            System.out.print("\n");
        }
        System.out.println("The car detail that above RM50000:");
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                if(j==2){
                    double price = Double.parseDouble(matrix[i][2]);
                    if(price>50000){
                        System.out.println("Car Detail "+p);
                        System.out.println("Car model: "+matrix[i][0]);
                        System.out.println("Car made: "+matrix[i][1]);
                        System.out.println("Car price: "+matrix[i][2]);
                        System.out.print("\n");
                        p++;
                    }
                }
            }
        }
    }
}
