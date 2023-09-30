import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //create a scanner to get User's input
        Scanner scanner = new Scanner(System.in);

        //Ask User to Enter a year
        while(true){
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("Please Enter A Year:");
            int year = scanner.nextInt();
            // Close the scanner
            if(year<=0){
                System.out.println("Year couldn't not be negative or zero.");
                continue;
            }
            //Leap Year Contion1:the year is divisible by 4 but not by 100
            boolean flg1 = year%4==0&&year%100!=0;
            //Leap Year Contion2:A year that is divisible by  4/100/400
            boolean flg2 = year%4==0&&year%100==0&&year%400==0;
            //Display Result
            if(flg1||flg2){
                System.out.println("Is Year of "+year+" a leap year? ");
                System.out.println("Yes");
            }else{
                System.out.println("Is Year of "+year+" a leap year? ");
                System.out.println("No");
            }
            //Ask user if they want to check another year
            System.out.println("Do you want to check another year? Y/N");
            if(scanner.next().equals("Y")){
                continue;
            }else{
                break;
            }

        }
        // Close the scanner
        scanner.close();



    }
}