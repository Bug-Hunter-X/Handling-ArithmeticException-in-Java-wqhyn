public class UncommonErrorExampleSolution {

    public static void main(String[] args) {
        try {
            int result = divide(10, 0); // Potential ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero! " + e.getMessage());
            // Additional handling such as logging
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("This always executes for cleanup.");
        }
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
}