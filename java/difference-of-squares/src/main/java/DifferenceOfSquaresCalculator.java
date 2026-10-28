class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int sum = 0;

        for (int i = 1; i <= input; i++) {
            sum += i;
        }
        // square sum
        return sum * sum;
    }

    int computeSumOfSquaresTo(int input) {
        // square each num from 1 to input
        int total = 0;

        for (int i = 1; i <= input; i++) {
            // add square val to total sum
            int squaredValue = i * i;
            total += squaredValue;
        }
        // return total sum
        return total;
    }

    int computeDifferenceOfSquares(int input) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
