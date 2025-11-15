public class Operations {
    public static void main(String[] args){
        // Arithmatic operations

        int x = 10;
        int y = 20;
        int z;

        z = x+y;
        // z = x-y;
        // z = x*y;
        // z = x/y;
        // z = x%y;
        // z = x++;
        // z = y--;

        // Augmented Assignment operations
        x = x +y;
        y++;
        System.out.println(z);
        System.out.println(x);
        System.out.println(y);

        // Order of operations ( Paranthesis- expo-mul-dev-add-subs)
        double result = 3 + (4 * 5) / 3 % 3;

        System.out.println(result);

    }
}

