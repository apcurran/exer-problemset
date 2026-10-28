class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int sum = 0;

        for (int i = 1; i <= input; i++) {
            sum += i;
        }

        return sum * sum;
    }

    int computeSumOfSquaresTo(int input) {
        int total = 0;

        for (int i = 1; i <= input; i++) {
            int squaredValue = i * i;
            total += squaredValue;
        }

        return total;
    }

    int computeDifferenceOfSquares(int input) {
        int squareOfSumTo = computeSquareOfSumTo(input);
        int sumOfSquaresTo = computeSumOfSquaresTo(input);

        return squareOfSumTo - sumOfSquaresTo;
    }

}
