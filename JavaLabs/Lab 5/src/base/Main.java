package base;

public class Main {
    /**
     * In our Assignment here we're running a little lemonade stand and we also sell pretzels. We need to keep track of
     * our inventory as well as the money that we're making throughout the day. I have code in the wet code section that
     * keeps track of all of this poorly. Come up with a better way to manage our system. There's not just one way to do
     * this so get creative and most importantly remember to stay DRY!
     *
     * We're gonna look at the first hour where we have 15 customers!
     *
     * We're responsible for keeping track of the number of pretzels and lemonades sold as well as the cash on hand and
     * in the tip jar! To keep things easy I won't make you make change! At the end of the day tips are split among the
     * employees! That means DON'T add it to the cash at the end of the day or during a transaction
     *
     * At the end we're going to print out our inventory left and how much we made in case for the day! Print out the
     * tips too!
     *
     * Remember to use functions, variables, and whatever else would make this easier to maintain!
     *
     * Pretzels are $2 for 1
     * Lemonade is $8 for 1
     */
    static int lemonades_available = 43;
    static int pretzels_available = 60;
    static double cash = 1500.0;
    static double tips = 0.0;


    public static void main(String[] args) {
        //	Replace this with your dry inventory function!
        dry_inventory(1,4,1,4);
        dry_inventory(2,2,3,0);
        dry_inventory(3,3,0,0);
        dry_inventory(4,1,2,0);
        dry_inventory(5,0,6,10);
        dry_inventory(6,0,4,5);
        dry_inventory(7,2,0,0);
        dry_inventory(8,10,8,10);
        dry_inventory(9,6,0,0);
        dry_inventory(10,0,1,0);
        dry_inventory(11,1,0,0);
        dry_inventory(12,0,7,4);
        dry_inventory(13,2,0,0);
        dry_inventory(14,6,3,0);
        dry_inventory(15,9,2,3);
        System.out.println("Results for the hour!");
        System.out.println("Lemonades Inventory: " + lemonades_available);
        System.out.println("Pretzels Inventory: " + pretzels_available);
        System.out.println("Cash: " + cash);
        System.out.println("Tips: " + tips);
    }

    static void dry_inventory(int customer_num,int num_pretzels, int num_lem, int tip) {
        pretzels_available -= num_pretzels;
        cash += num_pretzels*2;
        lemonades_available -= num_lem;
        cash += num_lem*8;
        tips += tip;
        System.out.println("Customer number"+customer_num);
    }

    static void wet_inventory() {
        /**
         * We have 10 customers in the first hour! This is what they bought! When running this with your dry code you
         * don't want to run this function because then the numbers in the end will be wrong!
         */


    }
}
