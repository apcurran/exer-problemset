class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int power = String.valueOf(numberToCheck).length();
        int n = numberToCheck;
        long sum = 0;

        while (n > 0) {
            // get digit
            int digit = n % 10;
            long raisedValue = (long) Math.pow(digit, power);
            sum += raisedValue;
            n /= 10;
        }

        return sum == numberToCheck;
    }

}
