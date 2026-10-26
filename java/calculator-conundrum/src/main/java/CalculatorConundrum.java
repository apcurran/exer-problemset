class CalculatorConundrum {
    public String calculate(int a, int b, String operation) {

        int result = 0;

        switch (operation) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
        }

        return "%d %s %d = %d".formatted(a, operation, b, result);
    }
}
