package java18;

/**
 * A utility class for basic math operations.
 */
public class MathUtils {

    /**
     * Adds two integers.
     *
     * @param a the first number
     * @param b the second number
     * @return the sum of a and b
     *
     * @snippet :
     * int result = MathUtils.add(2, 3);
     * System.out.println(result); // 5
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Multiplies two integers.
     *
     * @param x the first number
     * @param y the second number
     * @return the product of x and y
     *
     * @snippet :
     * int result = MathUtils.multiply(4, 5);
     * System.out.println(result); // 20
     */
    public static int multiply(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        System.out.println("Add: " + add(10, 20));
        System.out.println("Multiply: " + multiply(3, 7));
    }
}
