import java.util.Arrays;
public class NumberIdentifier {
 
        public static int countDigits(int num) {
            return String.valueOf(num).length();
        }
    
        public static int[] storeDigits(int num) {
            int count = countDigits(num);
            int[] digits = new int[count];
    
            for (int i = count - 1; i >= 0; i--) {
                digits[i] = num % 10;
                num /= 10;
            }
    
            return digits;
        }
    
        public static boolean isDuckNumber(int num) {
            String strNum = String.valueOf(num);
            return strNum.contains("0") && strNum.charAt(0) != '0';
        }

        public static boolean isArmstrongNumber(int num) {
            int[] digits = storeDigits(num);
            int power = digits.length;
            int sum = 0;
    
            for (int digit : digits) {
                sum += Math.pow(digit, power);
            }
    
            return sum == num;
        }
    
        public static int[] findLargestAndSecondLargest(int[] digits) {
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;
    
            for (int digit : digits) {
                if (digit > largest) {
                    secondLargest = largest;
                    largest = digit;
                } else if (digit > secondLargest && digit != largest) {
                    secondLargest = digit;
                }
            }
    
            return new int[]{largest, secondLargest};
        }
    
        public static int[] findSmallestAndSecondSmallest(int[] digits) {
            int smallest = Integer.MAX_VALUE;
            int secondSmallest = Integer.MAX_VALUE;
    
            for (int digit : digits) {
                if (digit < smallest) {
                    secondSmallest = smallest;
                    smallest = digit;
                } else if (digit < secondSmallest && digit != smallest) {
                    secondSmallest = digit;
                }
            }
    
            return new int[]{smallest, secondSmallest};
        }
    
        public static void main(String[] args) {
            int number = 153; 
    
            System.out.println("Number: " + number);
            System.out.println("Total Digits: " + countDigits(number));
    
            int[] digitsArray = storeDigits(number);
            System.out.println("Digits Array: " + Arrays.toString(digitsArray));
    
            System.out.println("Is Duck Number? " + (isDuckNumber(number) ? "Yes" : "No"));
            System.out.println("Is Armstrong Number? " + (isArmstrongNumber(number) ? "Yes" : "No"));
    
            int[] largestNumbers = findLargestAndSecondLargest(digitsArray);
            System.out.println("Largest Digit: " + largestNumbers[0] + ", Second Largest Digit: " + largestNumbers[1]);
    
            int[] smallestNumbers = findSmallestAndSecondSmallest(digitsArray);
            System.out.println("Smallest Digit: " + smallestNumbers[0] + ", Second Smallest Digit: " + smallestNumbers[1]);
        }
    }
     

