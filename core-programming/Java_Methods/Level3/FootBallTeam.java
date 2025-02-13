import java.util.Arrays;
public class FootBallTeam {
   
    public static int[] generateRandomHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + (int) (Math.random() * 101); 
        }
        return heights;
    }

    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    public static double findMeanHeight(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    public static int findShortestHeight(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            min = Math.min(min, height);
        }
        return min;
    }

    public static int findTallestHeight(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            max = Math.max(max, height);
        }
        return max;
    }

    public static void main(String[] args) {
        int size = 11; 
        int[] heights = generateRandomHeights(size);

        System.out.println("Player Heights (in cm): " + Arrays.toString(heights));

        System.out.println("Shortest Player Height: " + findShortestHeight(heights) + " cm");
        System.out.println("Tallest Player Height: " + findTallestHeight(heights) + " cm");
        System.out.println("Mean Height: " + findMeanHeight(heights) + " cm");
    }
}

