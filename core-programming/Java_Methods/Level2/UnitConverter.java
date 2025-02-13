
    public class UnitConverter {

        private static final double KM_TO_MILES = 0.621371;
        private static final double MILES_TO_KM = 1.60934;
        private static final double METERS_TO_FEET = 3.28084;
        private static final double FEET_TO_METERS = 0.3048;
    
        public static double convertKmToMiles(double km) {
            return km * KM_TO_MILES;
        }
    
        public static double convertMilesToKm(double miles) {
            return miles * MILES_TO_KM;
        }
    
        public static double convertMetersToFeet(double meters) {
            return meters * METERS_TO_FEET;
        }
    
        public static double convertFeetToMeters(double feet) {
            return feet * FEET_TO_METERS;
        }
    
        public static void main(String[] args) {
          
            double km = 10;
            double miles = 5;
            double meters = 20;
            double feet = 50;
    
            System.out.println(km + " km is " + convertKmToMiles(km) + " miles.");
            System.out.println(miles + " miles is " + convertMilesToKm(miles) + " km.");
            System.out.println(meters + " meters is " + convertMetersToFeet(meters) + " feet.");
            System.out.println(feet + " feet is " + convertFeetToMeters(feet) + " meters.");
        }
    }
    
