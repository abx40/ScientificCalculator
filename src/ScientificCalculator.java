import java.util.InputMismatchException;
import java.util.Scanner;

public class ScientificCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            displayMenu();
            System.out.print("Enter your choice: ");
            int choice = -1;

            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear the invalid input
                continue; // Skip the rest of the loop
            }

            switch (choice) {
                // Basic Arithmetic (Your existing code)
                case 1: performAddition(scanner); break;
                case 2: performSubtraction(scanner); break;
                case 3: performMultiplication(scanner); break;
                case 4: performDivision(scanner); break;

                // Added Scientific Operations
                case 5: performSquareRoot(scanner); break;
                case 6: performPower(scanner); break;
                case 7: performSine(scanner); break;
                case 8: performCosine(scanner); break;
                case 9: performTangent(scanner); break;
                case 10: performNaturalLog(scanner); break;
                case 11: performLogBase10(scanner); break;
                case 12: performAbsoluteValue(scanner); break;
                case 13: performRound(scanner); break;
                case 14: performCeiling(scanner); break;
                case 15: performFloor(scanner); break;
                case 16: performMin(scanner); break;
                case 17: performMax(scanner); break;

                // Control
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        System.out.println("Exiting calculator..."); // Your existing exit message
        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("\n--- Scientific Calculator ---");
        // Your existing menu options
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        // Added menu options
        System.out.println("\n--- Scientific Operations ---");
        System.out.println("5. Square Root (√x)");
        System.out.println("6. Power (x^y)");
        System.out.println("7. Sine (sin)");
        System.out.println("8. Cosine (cos)");
        System.out.println("9. Tangent (tan)");
        System.out.println("10. Natural Logarithm (ln)");
        System.out.println("11. Logarithm Base 10 (log)");
        System.out.println("12. Absolute Value (|x|)");
        System.out.println("13. Round");
        System.out.println("14. Ceiling (Round Up)");
        System.out.println("15. Floor (Round Down)");
        System.out.println("16. Minimum of two numbers");
        System.out.println("17. Maximum of two numbers");

        System.out.println("\n0. Exit"); // Your existing exit option
    }

    // --- Helper Methods for UI (Your existing code) ---

    private static void performAddition(Scanner scanner) {
        try {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            double result = add(num1, num2);
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numbers only.");
            scanner.next(); // Clear the invalid input
        }
    }

    private static void performSubtraction(Scanner scanner) {
        try {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            double result = subtract(num1, num2);
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numbers only.");
            scanner.next(); // Clear the invalid input
        }
    }

    private static void performMultiplication(Scanner scanner) {
        try {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            double result = multiply(num1, num2);
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numbers only.");
            scanner.next(); // Clear the invalid input
        }
    }

    private static void performDivision(Scanner scanner) {
        try {
            System.out.print("Enter numerator: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter denominator: ");
            double num2 = scanner.nextDouble();
            double result = divide(num1, num2);
            if (num2 != 0) {
                System.out.println("Result: " + result);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numbers only.");
            scanner.next(); // Clear the invalid input
        }
    }

    // --- Added Helper Methods for Scientific Operations ---

    private static void performSquareRoot(Scanner scanner) {
        try {
            System.out.print("Enter a number: ");
            double num = scanner.nextDouble();
            double result = calculateSquareRoot(num);
            if (!Double.isNaN(result)) {
                System.out.println("Result: " + result);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }
    }

    private static void performPower(Scanner scanner) {
        try {
            System.out.print("Enter the base: ");
            double base = scanner.nextDouble();
            System.out.print("Enter the exponent: ");
            double exponent = scanner.nextDouble();
            System.out.println("Result: " + calculatePower(base, exponent));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numbers only.");
            scanner.next();
        }
    }

    private static void performSine(Scanner scanner) {
        try {
            System.out.print("Enter angle in degrees: ");
            double degrees = scanner.nextDouble();
            System.out.println("Result: " + calculateSine(degrees));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }
    }

    private static void performCosine(Scanner scanner) {
        try {
            System.out.print("Enter angle in degrees: ");
            double degrees = scanner.nextDouble();
            System.out.println("Result: " + calculateCosine(degrees));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }
    }

    private static void performTangent(Scanner scanner) {
        try {
            System.out.print("Enter angle in degrees: ");
            double degrees = scanner.nextDouble();
            double result = calculateTangent(degrees);
            if (!Double.isNaN(result)) {
                System.out.println("Result: " + result);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }
    }

    private static void performNaturalLog(Scanner scanner) {
        try {
            System.out.print("Enter a number: ");
            double num = scanner.nextDouble();
            double result = calculateNaturalLogarithm(num);
            if (!Double.isNaN(result)) {
                System.out.println("Result: " + result);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }
    }

    private static void performLogBase10(Scanner scanner) {
        try {
            System.out.print("Enter a number: ");
            double num = scanner.nextDouble();
            double result = calculateLogarithmBase10(num);
            if (!Double.isNaN(result)) {
                System.out.println("Result: " + result);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }
    }

    private static void performAbsoluteValue(Scanner scanner) {
        try {
            System.out.print("Enter a number: ");
            double num = scanner.nextDouble();
            System.out.println("Result: " + Math.abs(num));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }
    }

    private static void performRound(Scanner scanner) {
        try {
            System.out.print("Enter a number to round: ");
            double num = scanner.nextDouble();
            System.out.println("Result: " + roundNumber(num));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }
    }

    private static void performCeiling(Scanner scanner) {
        try {
            System.out.print("Enter a number to round up: ");
            double num = scanner.nextDouble();
            System.out.println("Result: " + ceilingNumber(num));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }
    }

    private static void performFloor(Scanner scanner) {
        try {
            System.out.print("Enter a number to round down: ");
            double num = scanner.nextDouble();
            System.out.println("Result: " + floorNumber(num));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }
    }

    private static void performMin(Scanner scanner) {
        try {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            System.out.println("Result: " + findMin(num1, num2));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numbers only.");
            scanner.next();
        }
    }

    private static void performMax(Scanner scanner) {
        try {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            System.out.println("Result: " + findMax(num1, num2));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numbers only.");
            scanner.next();
        }
    }


    // --- Basic Arithmetic Methods (Your existing code) ---

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return Double.NaN; // Return "Not a Number"
        }
        return num1 / num2;
    }

    // --- Added Scientific Calculation Methods ---

    public static double calculateSquareRoot(double num) {
        if (num < 0) {
            System.out.println("Error: Cannot calculate the square root of a negative number.");
            return Double.NaN;
        }
        return Math.sqrt(num);
    }

    public static double calculatePower(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static double calculateSine(double degrees) {
        return Math.sin(Math.toRadians(degrees));
    }

    public static double calculateCosine(double degrees) {
        return Math.cos(Math.toRadians(degrees));
    }

    public static double calculateTangent(double degrees) {
        // Handle undefined cases for tangent (e.g., 90, 270 degrees)
        if (degrees % 180 != 0 && (degrees % 90 == 0)) {
            System.out.println("Error: Tangent is undefined for " + degrees + " degrees.");
            return Double.NaN;
        }
        return Math.tan(Math.toRadians(degrees));
    }

    public static double calculateNaturalLogarithm(double num) {
        if (num <= 0) {
            System.out.println("Error: Cannot calculate natural logarithm of a non-positive number.");
            return Double.NaN;
        }
        return Math.log(num);
    }

    public static double calculateLogarithmBase10(double num) {
        if (num <= 0) {
            System.out.println("Error: Cannot calculate base 10 logarithm of a non-positive number.");
            return Double.NaN;
        }
        return Math.log10(num);
    }

    public static long roundNumber(double num) {
        return Math.round(num);
    }

    public static double ceilingNumber(double num) {
        return Math.ceil(num);
    }

    public static double floorNumber(double num) {
        return Math.floor(num);
    }

    public static double findMin(double num1, double num2) {
        return Math.min(num1, num2);
    }

    public static double findMax(double num1, double num2) {
        return Math.max(num1, num2);
    }
}