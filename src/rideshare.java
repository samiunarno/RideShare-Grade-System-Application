public class rideshare {

    private static final double Day_base = 10.0;
    private static final double Night_base = 11.0;
    private static final double per_km_rate = 4.0;
    private static final double day_rate_km = 1.9;
    private static final double night_rate_km = 2.2;

    public boolean isDayTime (int hour){
        return hour >= 7 && hour < 23;
    }

    public double calculatefare(double distance, int hour){
        boolean day = isDayTime(hour);
        double base = day ? Day_base : Night_base;
        double rate = day ? day_rate_km : night_rate_km;

        if (distance <= per_km_rate) {
            return base;
        } else {
            return base + (distance - per_km_rate) * rate;
        }
    }
}
