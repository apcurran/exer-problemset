import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        if (square < 1 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }

        return BigInteger.TWO.pow(square - 1);
    }

    BigInteger grainsOnBoard() {
        BigInteger total = BigInteger.ZERO;

        for (int square = 1; square <= 64; square++) {
            BigInteger squareValue = grainsOnSquare(square);
            total = total.add(squareValue);
        }

        return total;
    }

}
