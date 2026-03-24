package solar_system;

public class PlanetOne {
   static String planet = "Mercury";
    static String size = "4,879 km in diameter";
    static String temperature = "ranges from -180'C to + 430'C";
    static String position = "closest to the star SUN";

    public static void printInfo() {
        System.out.println("Planet " + planet + " is " + position + ". It's size is " + size + " and temperature " + temperature);

    }

    public static void main(String[] args) {
        PlanetOne.printInfo();
    }
}
