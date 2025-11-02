import java.util.Scanner;

public class rideapp {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
        rideshare rs = new rideshare();
        System.out.println("Welcome to Ride Share App");
        System.out.println("--------------------------------");
        showWelcomeMessage();
        // rideshare.main(args);

        while (true) {
            System.out.println("\n--- New Trip Calculation ---");
            double distance = getDistanceInput(scanner);
            if(distance <0){
                continue;
            }
            int hour = getTimeInput(scanner);
            if(hour < 0){
                continue;
            }
            double fare = rs.calculateFare(distance, hour);
            String timeType = rs.isDayTime(hour) ? "Day Time" : "Night Time";
            showTripSummary(distance, hour, timeType, fare);
            processPayment(rs, scanner, fare);

            if (askToContinue (scanner) ){
                break;
            }
        }
        System.out.println("Thank you for Using Ride Share App!");

        }
            

    private static void showWelcomeMessage() {
        System.out.println("Tip: enter distance in kilometers and hour in 24-hour format (0-23).");
    }
    
    private static void showTripSummary(double distance, int hour, String timeType, double fare) {
        System.out.println("\n--- Trip Summary ---");
        System.out.printf("Distance: %.2f km%n", distance);
        System.out.println("Hour: " + hour);
        System.out.println("Time: " + timeType);
        System.out.printf("Estimated Fare: $%.2f%n", fare);
    }

    private static double getDistanceInput(Scanner scanner){
        System.out.println("Enter Distance in KM :");
        try {
            double distance = scanner.nextDouble();
            if(distance < 0){
                System.out.println("Error Distance Invalid");
                return -1;
            }
            return distance;
        } catch (Exception e) {
            System.out.println("Error Please Enter a Valid Number");
            scanner.next(); // Clear the invalid input
            return -1;
        }
    }

    private static int getTimeInput(Scanner scanner){
        System.out.print("Enter Start Hour (0-23) : ");
        try {
            int hour = scanner.nextInt();
            if (hour < 0 || hour > 23) {
                System.out.println("Error Hour Must be between 0 to 23");
                return -1;
            }
            return hour;
        } catch (Exception e) {
            System.out.println("Error Please Enter a Valid Number");
            scanner.next(); // Clear the invalid input
            return -1;
        }
    }

    private static void processPayment(rideshare rs ,Scanner scanner, double fare){
        System.out.println();

    }
}
