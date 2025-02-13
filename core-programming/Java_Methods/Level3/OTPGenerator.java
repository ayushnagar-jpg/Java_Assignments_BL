import java.util.HashSet;
import java.util.Random;

public class OTPGenerator {

    public static int generateOTP() {
        return 100000 + new Random().nextInt(900000); 
    }

    public static int[] generateMultipleOTPs(int count) {
        int[] otpArray = new int[count];
        for (int i = 0; i < count; i++) {
            otpArray[i] = generateOTP();
        }
        return otpArray;
    }

    public static boolean areOTPsUnique(int[] otpArray) {
        HashSet<Integer> otpSet = new HashSet<>();
        for (int otp : otpArray) {
            otpSet.add(otp);
        }
        return otpSet.size() == otpArray.length; 
    }

    public static void main(String[] args) {
        int numberOfOTPs = 10;
        int[] otpArray = generateMultipleOTPs(numberOfOTPs);

        System.out.println("Generated OTPs: ");
        for (int otp : otpArray) {
            System.out.println(otp);
        }

        if (areOTPsUnique(otpArray)) {
            System.out.println("All OTPs are unique ");
        } else {
            System.out.println("Some OTPs are repeated ");
        }
    }
}

