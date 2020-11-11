package Java.Railways;

import java.util.*;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\tWelcome Railways\t");

        System.out.print("Enter the Number of Passenger: ");
        int passengerNumber = scanner.nextInt();
        scanner.nextLine();

        Passengers ob_1 = new Passengers(passengerNumber);

        ob_1.getName(passengerNumber);

        ob_1.getAge(passengerNumber);

        ob_1.getContactNumber(passengerNumber);

        ob_1.getStartCity();
        //ob_1.getDate();

        ob_1.printPassengerDetails(passengerNumber);




       // FareCalculation ob_2 = new FareCalculation();

        //ob_2.fareCalculation(passengerNumber);


    }
}


