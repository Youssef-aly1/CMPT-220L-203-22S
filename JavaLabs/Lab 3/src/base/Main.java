package base;

public class Main {
    /**
     * # Lab Two
     *
     * Ok for this lab we're going to reiterate a lot of the things that we went over in class.
     *
     * Our Goals are:
     * - Conditionals
     *     - If
     *     - Else
     *     - Else If
     */
    public static void main(String[] args) {
        // Make an if statement that triggers a print or println statement
        if (true) {
            System.out.println("yo.");
        }
        // Make an if, else statement where the else statement triggers a print or println statement
        if (true) {
            System.out.println("hello");
        } else{
            System.out.println("this is java");
        }
        // Make an if, else if, else statement where the else if statement triggers a print or println statement
        if (true) {
            System.out.println("this is true");
        } else if(!true){
            System.out.println("This is false");
        }
        // Make 2 variables and use them in an if else conditional print from one of the sections
        boolean skill = true;
        boolean aim = false;
        if (skill){
            System.out.println("You have skill");
        } else{
            System.out.println("You don't have skill");
        }
        // Make an if statement using 2 variables and an AND(&&) statement that triggers a print or println statement
        // Make an if statement using 2 variables and an OR(||) statement that triggers a print or println statement
    }
}
