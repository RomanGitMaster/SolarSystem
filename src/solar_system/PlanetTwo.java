package solar_system;

public class PlanetTwo {

    String name = "Venus";
    String size = "12 104 km in diameter";
    String temperature = "462'C";
    String position = "second planet to the SUN";

    public void printInfo() {
        System.out.println("Planet " + name + " is " + position + ". It is " + size + " and has temperature of " + temperature);
    }

    public static void main(String[] args) {
        PlanetTwo p = new PlanetTwo();
        p.printInfo();
    }
}
