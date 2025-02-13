import java.util.Arrays;
public class NumberAnalysis {
   

    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] extractDigits(int num) {
        int count = countDigits(num);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    public static int calculateSumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static int calculateSumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int num) {
        int[] digits = extractDigits(num);
        int sum = calculateSumOfDigits(digits);
        return num % sum == 0;
    }

    public static int[][] computeDigitFrequency(int num) {
        int[] digits = extractDigits(num);
        int[] freq = new int[10]; 

        for (int digit : digits) {
            freq[digit]++;
        }

        int[][] frequencyArray = new int[10][2];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                frequencyArray[index][0] = i;   
                frequencyArray[index][1] = freq[i]; 
                index++;
            }
        }

        return Arrays.copyOf(frequencyArray, index);
    }

    public static void main(String[] args) {
        int number = 1729; 

        System.out.println("Number: " + number);
        System.out.println("Total Digits: " + countDigits(number));

        int[] digitsArray = extractDigits(number);
        System.out.println("Digits Array: " + Arrays.toString(digitsArray));

        System.out.println("Sum of Digits: " + calculateSumOfDigits(digitsArray));
        System.out.println("Sum of Squares of Digits: " + calculateSumOfSquares(digitsArray));

        System.out.println("Is Harshad Number? " + (isHarshadNumber(number) ? "Yes" : "No"));

        int[][] frequencyArray = computeDigitFrequency(number);
        System.out.println("Digit Frequencies:");
        for (int[] pair : frequencyArray) {
            System.out.println("Digit: " + pair[0] + " - Frequency: " + pair[1]);
        }
    }
}


