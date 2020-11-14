package Railway;

import java.util.*;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\tWelcome Railways\t");
        System.out.println("                     ");
        System.out.println("ROUTES AVAILABLE: hyd->pune  vizag->kolkata ");

        System.out.print("Enter the Number of Passenger: ");
        int passengerNumber = scanner.nextInt();
        scanner.nextLine();

        Ticket ti=new Ticket();


        Passengers ob_1 = new Passengers(passengerNumber);

        ob_1.getName(passengerNumber);

        ob_1.getAge(passengerNumber);

        ob_1.getContactNumber(passengerNumber);
        ti.addPassenger(ob_1);

        ti.setStartCity(ob_1.getStartCity());
        ti.setEndCity(ob_1.getEndCity());
        System.out.println("Ticket start station: "+ti.getStartCity());



        ob_1.printPassengerDetails(passengerNumber);

        Train t=new Train();




        System.out.println("THANK YOU! YOUR TICKET HAS BEEN BOOKED. DETAILS:-");
        System.out.println("Train Details "+ t.getTrainInfo());








    }

}

