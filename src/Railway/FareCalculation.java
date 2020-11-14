package Railway;

import java.util.ArrayList;
import java.util.Scanner;

public class FareCalculation {
    public static Scanner scanner = new Scanner(System.in);
    int passengerNumber = 0;
    // int age = 0;
    ArrayList<String> fullName = new ArrayList<String>();
    int[] age = new int[passengerNumber];
    public void fareCalculation(int passengerNumber) {
        System.out.println("\n **** Choose type of seat you want to book ****");
        System.out.println("\t1. AC First Class  (Rs 2000 per seat)");
        System.out.println("\t2. AC Second tier  (Rs 1500 per seat)");
        System.out.println("\t3. AC Third tier   (Rs 1000 per seat)");
        System.out.println("\t4. Sleeper Class   (Rs 600 per seat )");
        System.out.println("\t5. AC chair Class  (Rs 800 per seat )");
        System.out.println("\t6. Second sitting  (Rs 400 per seat )");
        System.out.print("Enter Your Choice: ");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("Your AC first class has been booked");
                System.out.println("Your Total is Rs: " + (2000 * passengerNumber));
                break;
            case 2:
                System.out.println("Your AC second class has been booked");
                System.out.println("Your Total is Rs: "+(1500 * passengerNumber));
                break;
            case 3:
                System.out.println("Your AC Third class has been booked");
                System.out.println("Your Total is Rs: "+(1000 * passengerNumber));
                break;
            case 4:
                System.out.println("Your Sleeper Class has been booked");
                System.out.println("Your Total is Rs: "+(600 * passengerNumber));
                break;
            case 5:
                System.out.println("Your AC chair class has been booked");
                System.out.println("Your Total is Rs: "+(800 * passengerNumber));
                break;
            case 6:
                System.out.println("Your Second sitting has been booked");
                System.out.println("Your Total is Rs: "+(400 * passengerNumber));
                break;
            default:
                System.out.println("Please choose between option 1-6");
                break;
        }


    }

}

