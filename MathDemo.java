public class MathDemo {

    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int sum(int[] numbers) {
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        return total;
    }

    public static float mean(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        return (float) sum(numbers) / numbers.length;
    }

    public static int factorial(int n) {
        if (n < 0) {
            return -1; 
        }

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {

        int a = 5;
        int b = 8;

        System.out.println("Min: " + min(a, b));
        System.out.println("Max: " + max(a, b));

        int[] numbers = {2, 4, 6, 8};

        System.out.println("Sum: " + sum(numbers));
        System.out.println("Mean: " + mean(numbers));

        System.out.println("Factorial of 5: " + factorial(5));
      //ADVANTAGE OF DEFINING THESE METHODS AS STATIC: These methods are defined as static because they do not depend on any object
// or instance variables. They only perform calculations using the parameters given to them. By making them static, we can call the methods directly using the class name
// without creating an object of the MathDemo class.
    }


}
