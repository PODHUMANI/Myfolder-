// Efficient JAVA program to find sum of first
// n natural numbers that avoids overflow if
// result is going to be within limits.
import java.io.*;

class GfG {
    public static void main(String args[]) {
        int n = 5;
        int sum;
        if (n % 2 == 0)
            sum = (n / 2) * (n + 1);
        // If n is odd, (n+1) must be even
        else
            sum = ((n + 1) / 2) * n;
        System.out.println(sum);
    }
}
