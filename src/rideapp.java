import java.util.Scanner;

public class rideapp {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
        rideshare rs = new rideshare();
        System.out.println("Welcome to Ride Share App");
        System.out.println("--------------------------------");
        rideshare.main(args);

        while (true) {
            System.out.println("\n--- New Trip Calculation ---");
            System.out.print("Enter distance (in km): ");
            double distance = scanner.nextDouble();
            System.out.print("Enter hour of the day (0-23): ");
            int hour = scanner.nextInt();

            if (distance < 0 ){
                System.out.println("Error Values");
                continue;
            }

            if (hour < 0 || hour > 23)
            {
                System.out.println("Hour Must be between 0 to 23");
                continue;
            }

            double fare = rs.calculateFare(distance, hour);

            System.out.println("\n Trip Summary :");
            System.out.println("Distance: " + distance + " km");
            System.out.println("Hour: " + hour + ":00 (" + (rs.isDayTime(hour) ? "Day Time" : "Night Time " + (hour < 12 ? "AM" : "PM")) + ")");
            System.out.println("Total Fare : RMB" + String.format("%.2f", fare));
            System.out.print("\n Calculate Another Trip? (yes/no) : ");
            String choice = scanner.next();

            if(choice.equals("no") || choice.equals("n")){
                System.out.println("Thank you for using Ride Share App!");
                break;
            }
            else {
                System.out.println("Invalid");
                continue;
            }
    }
    scanner.close();
        }
    
    }
    
}
