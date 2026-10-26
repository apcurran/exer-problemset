class CalculatorConundrum {
    public String calculate(int a, int b, String operation) {
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        } else if (operation.isEmpty()) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }

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
            default:
                throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }

        return "%d %s %d = %d".formatted(a, operation, b, result);
    }
}
