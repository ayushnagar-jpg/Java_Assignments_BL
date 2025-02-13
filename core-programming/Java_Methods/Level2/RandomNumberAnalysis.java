import java.util.Arrays;

public class RandomNumberAnalysis {

    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + (int) (Math.random() * 9000); 
        }

        return numbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = sum / numbers.length;
        return new double[]{average, min, max}; // Returning results in an array
    }

    public static void main(String[] args) {
        int size = 5; 
        int[] randomNumbers = generate4DigitRandomArray(size);

        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));

        double[] results = findAverageMinMax(randomNumbers);

        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + (int) results[1]);
        System.out.println("Maximum: " + (int) results[2]);
    }
}
