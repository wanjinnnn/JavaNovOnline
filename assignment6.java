import java.util.Scanner;

public class assignment6 {
    public static void main(String[] args) {
        //Use Scanner to get the day number and the result of the switch must be portrayed in the console.
        Scanner scanner=new Scanner(System.in);
        String dayOfWeek;
        System.out.print("Please input the day of the week: ");
        int num=scanner.nextInt();

        
        switch (num){
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case 7:
                dayOfWeek = "Sunday";
                break;
            default:
                dayOfWeek = "Invalid";
                break;
        }
        System.out.println("Day of the week: " + dayOfWeek);
    }
    
}
