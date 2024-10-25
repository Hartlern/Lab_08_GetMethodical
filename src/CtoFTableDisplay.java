public class CtoFTableDisplay {
    public static void main(String[] args) {
        System.out.printf("%-15s %s%n", "Celsius", "Fahrenheit");
        System.out.println("-----------------------------");

        // Loop through Celsius values from -100 to 100
        for (int celsius = -100; celsius <= 100; celsius++) {
            double fahrenheit = CtoF(celsius); // Convert Celsius to Fahrenheit
            System.out.printf("%-15d %.2f%n", celsius, fahrenheit); // Print the table
        }
    }

    public static double CtoF(double Celsius) {
        return (Celsius * 9/5) + 32; // Conversion formula
    }
}