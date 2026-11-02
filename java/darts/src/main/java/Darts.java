class Darts {
    int score(double xOfDart, double yOfDart) {
        // (0, 0) would be dead center
        // pythagorean theorem

        double distance = Math.sqrt(xOfDart * xOfDart + yOfDart * yOfDart);

        if (distance <= 1) {
            return 10;
        } else if (distance <= 5) {
            return 5;
        } else if (distance <= 10) {
            return 1;
        } else {
            // air dart
            return 0;
        }
    }
}
