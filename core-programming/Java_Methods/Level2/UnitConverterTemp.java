public class UnitConverterTemp {


        public static double convertFahrenheitToCelsius(double fahrenheit) {
            return (fahrenheit - 32) * 5 / 9;
        }
    
        public static double convertCelsiusToFahrenheit(double celsius) {
            return (celsius * 9 / 5) + 32;
        }
    
        public static double convertPoundsToKilograms(double pounds) {
            return pounds * 0.453592;
        }
    
        public static double convertKilogramsToPounds(double kilograms) {
            return kilograms * 2.20462;
        }
    
        public static double convertGallonsToLiters(double gallons) {
            return gallons * 3.78541;
        }
    
        public static double convertLitersToGallons(double liters) {
            return liters * 0.264172;
        }
    
        public static void main(String[] args) {
           
            double fahrenheit = 98.6;
            double celsius = 37;
            double pounds = 150;
            double kilograms = 68;
            double gallons = 5;
            double liters = 10;
    
            System.out.println(fahrenheit + "°F is " + convertFahrenheitToCelsius(fahrenheit) + "°C.");
            System.out.println(celsius + "°C is " + convertCelsiusToFahrenheit(celsius) + "°F.");
            System.out.println(pounds + " pounds is " + convertPoundsToKilograms(pounds) + " kg.");
            System.out.println(kilograms + " kg is " + convertKilogramsToPounds(kilograms) + " pounds.");
            System.out.println(gallons + " gallons is " + convertGallonsToLiters(gallons) + " liters.");
            System.out.println(liters + " liters is " + convertLitersToGallons(liters) + " gallons.");
        }
    }
    

