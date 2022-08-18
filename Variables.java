/* Java Variables
 * String - stores text. Must be surrounded by double quotes.
 * int - stores integers without decimals.
 * float - stores floating point numbers with decimals.
 * char - stores single characters such as 'a' or 'b'. Char values are surrounded by single quotes.
 * boolean - stores values with two states: true or false.
 */

public class Variables {
    public static void main(String[] args) {
        String name = "Me";
        System.out.println(name);
        /*int myNum = 15;
        System.out.println(myNum);
        */
        // Or i can also declare a variable without assgning the value, rather assinging it later.//
        int myNumTwo;
        myNumTwo = 15;
        System.out.println(myNumTwo);
        // I can also change the value of myNum from 15 to 20 like so//
        int myNum = 15;
        myNum = 20; // myNum is now 20
        System.out.println(myNum);
    }
}