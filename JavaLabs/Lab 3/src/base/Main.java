package base;

public class Main {
    /**
     * # Lab Three
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
            System.out.println("Hello Professor");
        }
        // Make an if, else statement where the else statement triggers a print or println statement
        if (true) {
            System.out.println("nothing");
        } else{
            System.out.println("hello");
        }
        // Make an if, else if, else statement where the else if statement triggers a print or println statement
        if (true) {
            System.out.println("this is true");
        } else if(!true){
            System.out.println("This is false");
        }
        // Make 2 variables and use them in an if else conditional print from one of the sections
        String skill = "you have a lot of skill";
        boolean aim = false;
        if (!aim){
            System.out.println(skill);
        } else{
            System.out.println("You don't have skill");
        }
        // Make an if statement using 2 variables and an AND(&&) statement that triggers a print or println statement
        boolean macaroni = true;
        boolean cheese = true;
        if ((macaroni) && cheese) {
            System.out.println("I can make mac and cheese!");
        }
        // Make an if statement using 2 variables and an OR(||) statement that triggers a print or println statement
        boolean apple = true;
        boolean orange = false;
        if (apple || orange) {
            System.out.println("I can enjoy some fruit");
        }
    }
}
