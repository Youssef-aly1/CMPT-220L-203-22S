package base;

public class Main {
    /**
     * # Lab Four
     * ---
     *
     * For this lab we're going to be making and using a bunch of functions.
     *
     * Our Goals are:
     * - Switch Case
     * - Looping
     * - Making our own functions
     * - Combining functions
     * - Structuring solutions
     */

    public static void main(String[] args) {
        // Give me an example of you using switch case.
        String fruit = "apple";

        switch (fruit){
            case "orange":
            System.out.println("So you like oranges.");
                break;
            case "grape":
                System.out.println("So you prefer grapes.");
                break;
            case "pear":
                System.out.println("So you like pears.");
                break;
            case "banana":
                System.out.println("So you enjoy bananas.");
                break;
            case "blueberry":
                System.out.println("You are weird");
                break;
        }

        // Give me an example of you using a for loop
        for (int apples = 0; apples < 10;apples++) {
            System.out.println("inventory check: we have "+apples + " apples.");
        }
        // Give me an example of you using a while loop
        int max = (int) (Math.random() * 10);
        int num = 0;
        while (num != max) {
            System.out.println("We haven't found the max number");
            num++;
        }
        System.out.println("we found it! the max number was: "+ max);
    }
    // For the following todos you'll probably want to define them below and then call them from the main function above.

    /**
     * I want you to write a function that will take in a number and raise it to the power given.
     * For example if given the numbers 2 and 3. The math that the function should do is 2^3
     * and should print out or return 8. Print the output.
     */
    double exponent (double input1, double input2){
        double answer = Math.pow(input1, input2);
        return answer;
    }

    /**
     * I want you to write a function that will take in a list and see how many times a given number is in the list.
     * For example if the array given is [2,3,5,2,3,6,7,8,2] and the number given is 2 the function should print out
     * or return 3. Print the output.
     */
    int array_count (int[] list, int num) {
        int count = 0;
        for (  int nums: list) {
            count++;
            System.out.println(count);
        }
        return count;
    }
    /**
     * Create a function named summation that will take in an int[ ] and return an int.
     * I want the function to then go through the given array and sum up digits in the array.
     * Once that’s done print or return the answer. Print the output
     */
    int summation (int[] list) {
        int sum = 0;
        for (int num: list) {
            sum = sum + num;
        }
        System.out.println(sum);
        return sum;
    }
    /**
     * Give me a function that gives the answer to the pythagorean theorem.
     * I'd like you to reuse the exponent function from above as well as the functions below to make your function.
     *
     * If you don't remember the pythagorean theorem the formula is (a^2 + b^2 = c^2).
     * Given a and b as parameters i'd like you to return c.
     *
     * If this doesn't make sense look up `Pythagorean Theorem Formula` on google.
     *
     * Once that’s done print or return the answer. Print the output
     */
    double pythagorean (int a, int b) {
        double A = exponent(a,2);
        double B = exponent(b,2);
        double C = addition(A,B);
        double D = exponent(C,2);
        System.out.println(D);
        return D;
    }
    

    double addition(double a, double b) {
        double answer = a + b;
        return answer;
    }

    int division(int a, int b) {
        int answer = a / b;
        return answer;
    }
}
