package app;

public class Main {

    public static final double KM_COEFFICIENT = 1.621;

    public static void main(String[] args) {
        System.out.println("App for miles to kilometers conversion and vice versa");

        double miles = 10;
        double kilometers = convertMilesToKm(miles);
        System.out.printf("%.3f miles are equivalent to %.3f kilometers\n", miles, kilometers);
    }
    public static double convertMilesToKm(double miles) {
        return miles * KM_COEFFICIENT;
    }
}
