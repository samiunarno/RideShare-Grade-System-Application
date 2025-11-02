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
        System.out.println("\n Select Payment Method: ");
        System.out.println("1. Cash");
        System.out.println("2. Card");
        System.out.println("3. WeChat");
        System.out.println("4. Alipay");
        System.out.println("5. Membership");

        int choice = scanner.nextInt();
        String paymentMethod = "";

        switch (choice) {
            case 1:
                paymentMethod = "cash";
                break;
                
            case 2:
                paymentMethod = "card";
                break;
            case 3:
                paymentMethod = "wechat";
                break;
            case 4:
                paymentMethod = "alipay";
                break;
            case 5:
                paymentMethod = "Membership";
                break;
            default:
                System.out.println("Invalid choice. Please select a valid payment method.");
                return;
        }

        rs.processPayment(fare, paymentMethod);
    }

    private static int getPaymentChoice(Scanner scanner){
        System.out.print("Enter Your Choice (1-5) :");
        try {
            int choice = scanner.nextInt();
            if(choice < 1 || choice > 5){
                System.out.println("Invalid choice. Please select a valid payment method.");
                return 1;
            }
            return choice;
        } catch (Exception e) {
            System.out.println("Error Invalid Number Using Cash Payment");
            scanner.next(); // Clear the invalid input
            return 1;
        }
    }

    private static boolean askToContinue(Scanner scanner){
        System.out.println("\n Do you want to Book another Trip (yes/no) ?");
        String response = scanner.next().toLowerCase();
        return response.equals("yes") || response.equals("y");
    }
}
