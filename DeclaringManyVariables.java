public class DeclaringManyVariables {
    public static void main(String[] args) {
        /* I can also declare more than one variable of the same type using the comma-separated list */
        int x = 5, y = 6, z = 50;
        System.out.println(x + y + z);
        // or we can assign the same value to multiple variables in one line
        int a, b, c;
        a = b = c = 50;
        System.out.println(a + b + c);
    }
}
