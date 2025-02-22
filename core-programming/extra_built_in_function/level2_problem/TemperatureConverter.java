import java.util.Scanner;

class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();
        System.out.print("Convert to (C/F): ");
        char unit = scanner.next().charAt(0);
        
        if (unit == 'C' || unit == 'c') {
            System.out.println("Temperature in Celsius: " + toCelsius(temp));
        } else {
            System.out.println("Temperature in Fahrenheit: " + toFahrenheit(temp));
        }
        scanner.close();
    }
    
    public static double toCelsius(double f) {
        return (f - 32) * 5/9;
    }
    
    public static double toFahrenheit(double c) {
        return (c * 9/5) + 32;
    }
}
