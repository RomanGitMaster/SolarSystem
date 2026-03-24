package solar_system;

public class Star {
    static String star = "SUN";
    static String age = "4.6 billions years";
    static String size = "1.39 millions km";
    static String energyOutput = "3.8x10(26) joules/s";


    public static void print() {
        System.out.println(star + " is " + age + " old, with the its diameter size " + size + " it radiates " + energyOutput);
    }

    public static void main(String[] args) {
        System.out.println("Solar system star is " + star);

        Star.print();
    }
}