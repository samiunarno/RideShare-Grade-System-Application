public class rideshare {

    private static final double Day_base = 10.0;
    private static final double Night_base = 11.0;
    private static final double per_km_rate = 4.0;
    private static final double day_rate_km = 1.9;
    private static final double night_rate_km = 2.2;

    public boolean isDayTime(int hour) {
        return hour >= 7 && hour < 23;
    }

    public double calculateFare(double distance, int hour) {
        if (isDayTime(hour)){
            if(distance <= per_km_rate){
                return Day_base;
            } else {
                return Day_base + (distance - per_km_rate) * day_rate_km;
            }
        } else {
            if(distance <= per_km_rate){
                return Night_base;
            } else {
                return Night_base + (distance - per_km_rate) * night_rate_km;
            }
        }
    }

    public void processPayment(double amount, String paymentMethod){
        System.out.println("Processing payment...");
        System.out.println("Amount: RMB " + String.format("%.2f", amount));
        System.out.println("Payment Method: " + paymentMethod);

        switch (paymentMethod.toLowerCase()) {
            case "cash": {
                processCashPayment(amount);
                break;
            }
            case "card": {
                processCardPayment(amount);
                break;
            }
            case "wechat": {
                processWechatPayment(amount);
                break;
            }
            case "alipay": {
                processAlipayPayment(amount);
                break;
            }
            case "membership": {
                processMembershipPayment(amount);
                break;
            }
            default: {
                System.out.println("Unsupported payment method. Please use 'cash' or 'card'.");
                break;
            }
        }
    }

    private void processCashPayment(double amount) {
        // handle cash payment (e.g., record, print receipt)
        System.out.println("Collected cash payment: RMB " + String.format("%.2f", amount));
    }

    private void processCardPayment(double amount) {
        // placeholder for card processing logic
        System.out.println("Processing card payment for RMB " + String.format("%.2f", amount));
        System.out.println("Card charged successfully.");
    }

    private void processWechatPayment(double amount) {
        // placeholder for WeChat payment processing logic
        System.out.println("Processing WeChat payment for RMB " + String.format("%.2f", amount));
        System.out.println("WeChat payment successful.");
    }

    private void processAlipayPayment(double amount) {
        // placeholder for Alipay payment processing logic
        System.out.println("Processing Alipay payment for RMB " + String.format("%.2f", amount));
        System.out.println("Alipay payment successful.");
    }

    private void processMembershipPayment(double amount) {
        // handle membership payment (e.g., apply discount, deduct balance)
        System.out.println("Processing membership payment for RMB " + String.format("%.2f", amount));
        System.out.println("Membership payment processed.");
    }

    private void printReciept(double distance, int hour, double fare, String paymentMethod){
        System.out.println("----- Trip Receipt -----");
        System.out.println("Distance: " + distance + " KM");
        System.out.println("Time: " + (isDayTime(hour) ? "Day" : "Night"));
        System.out.println("Fare: RMB " + String.format("%.2f", fare));
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Transaction Successful!");
        System.out.println("Thank you for riding with us!");
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {

        rideshare calc = new rideshare();

        System.out.println("Testing Rideshare with Payment");
        double fare = calc.calculateFare(8.0, 14);

        System.out.printf("Fare :  RMB %.2f%n", fare);
        System.out.println("Rideshare fare calculator");
        System.out.println("\n Taxi Pricing Rules : ");
        System.out.println("Day Time (7:00 AM to 11:00 PM)");
        System.out.println("Night Time (11:00 PM to 7:00 AM)");
        System.out.println("Night Time (11:00 PM to 7:00 AM)");
        System.out.println("First " + per_km_rate + " KM: RMB " + Night_base);
        System.out.println("Additional KM : RMB " + night_rate_km + "/km");
    }
}
