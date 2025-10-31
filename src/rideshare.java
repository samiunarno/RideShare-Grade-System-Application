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

    public void print_pricing(){
        System.out.println("\n Taxi Pricing Rules : ");
        System.out.println("Day Time (7:00 AM to 11:00 PM)");
        System.out.println("Night Time (11:00 PM to 7:00 AM)");
        System.out.println("Night Time (11:00 PM to 7:00 AM)");
        System.out.println("First " + per_km_rate + " KM: RMB " + Night_base);


    }

    public static void main(String[] args) {
        System.out.println("Rideshare fare calculator");
    }
}