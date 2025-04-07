package app;

public class Main {

    public static final double KM_COEFFICIENT = 1.621;

    public static void main(String[] args) {
        System.out.println("App for miles to kilometers conversion and vice versa");

        double miles = 10;
        double kilometers = convertMilesToKm(miles);
        System.out.printf("%.3f miles are equivalent to %.3f kilometers\n", miles, kilometers);

        miles = convertKmToMiles(kilometers);
        System.out.printf("%.3f kilometers are equivalent to %.3f miles\n", kilometers, miles);
    }
    public static double convertMilesToKm(double miles) {
        return miles * KM_COEFFICIENT;
    }

    public static double convertKmToMiles(double km) {
        return km / KM_COEFFICIENT;
    }
}
