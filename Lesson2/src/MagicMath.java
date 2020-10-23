/**
 * Class for mathematical calculations
 * @author Akchurin Artyom
 * @version 1.0
 */
public class MagicMath {
    /**
     * Calculates the factorial of a number
     * Restriction: only works with the int data type
     * @param n Number
     * @return Factorial of a number
     */
    public static int fact(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++)
            factorial *= i;
        return factorial;
    }

    /**
     * Calculates the module of a number
     * Restriction: only works with the int data type
     * @param n Number
     * @return Module of a number
     */
    public static int abs(int n) {
        if (n < 0)
            return -n;
        return n;
    }

    /**
     * Raises a number to a power
     * Restriction: only works with non-negative values
     * @param n Number
     * @param e Power of a number
     * @return Raised to the power number
     */
    public static int pow(int n, int e) {
        int res = 1;
        for (int i = 1; i <= e; i++)
            res *= n;
        return res;
    }
}