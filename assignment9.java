import java.util.Scanner;

public class assignment9 {
    public static void main(String[] args) {
        //Use the same code in assignment 7 this time. For both option 1 and option 2 the user must enter 12 values. If the user choose option 1 he/she will get the proper output but if the user chooses the option 2, he/she will get ArrayIndexOutOfBoundsException error.
        Scanner scanner=new Scanner(System.in);
        System.out.print("1:Enter the stage. \n2:Enter value for 34 matrix. \n3:Enter values for 23 matrix.\nPlease insert a number:");
        int num=scanner.nextInt();
        try{
            switch(num){
                case 1:
                    System.out.println("Please enter the stage.");
                    break;

                case 2:
                    System.out.println("Please input the number for 34 matrix.");
                    int [][] matrix34=new int [3][4];
                    for(int i=0;i<3;i++){
                        for(int j=0;j<4;j++){
                            System.out.print("Please input value for matrix ["+i+"]["+j+"]: ");
                            matrix34[i][j]=scanner.nextInt();

                        }
                    }
                    System.out.println("The 34 matrix you entered is: ");
                    printMatrix(matrix34);
                    break;

                case 3:
                    System.out.println("Please input the number for 23 matrix.");
                    int [][] matrix23=new int [2][3];
                    for(int i=0;i<3;i++){
                        for(int j=0;j<4;j++){
                            System.out.print("Please input value for matrix ["+i+"]["+j+"]: ");
                            matrix23[i][j]=scanner.nextInt();
                        }
                    }
                    System.out.println("The 23 matrix you entered is: ");
                    printMatrix(matrix23);
                    break;

                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("\nError: The chosen matrix size is smaller than expected.");
        }
        scanner.close();
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
