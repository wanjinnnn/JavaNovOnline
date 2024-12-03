import java.util.Scanner;

public class assignment7 {
    public static void main(String[] args) {
        //Create new file that the scanner get the value for the switch, if the user choose 1 he/she will enter stage that he/she needs to enter a value for 34 matrix, if the user choose 2 he/she will enter the stage that he/she need to enter values for 23 matrix. The result of the user must be shown regardless of the option.
        Scanner scanner=new Scanner(System.in);
        System.out.print("1:Enter the stage. \n2:Enter value for 34 matrix. \n3:Enter values for 23 matrix.\nPlease insert a number:");
        int num=scanner.nextInt();
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
                for(int i=0;i<2;i++){
                    for(int j=0;j<3;j++){
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
