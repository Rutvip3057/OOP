public class Division {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                throw new IllegalArgumentException("Please provide numerator and denominator");
            }

            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            int result = numerator / denominator;

            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}