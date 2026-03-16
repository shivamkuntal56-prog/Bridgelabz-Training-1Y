package Level_3;

class OTP {
    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }
    public static boolean OTPUnique(int[] otpArray) {
        for (int i = 0; i < otpArray.length; i++) {
            for (int j = i + 1; j < otpArray.length; j++) {
                if (otpArray[i] == otpArray[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] otps = new int[10];
        for (int i = 0; i < otps.length; i++) {
            otps[i] = OTP.generateOTP();
        }
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }
        if (OTP.OTPUnique(otps)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Some OTPs are the same.");
        }
    }
}