import java.io.*;

class GFG {
    public static void main(String[] args) {
        int n = 100;

        // Print the prime factors
        printFactors(n);
    }

    // Optimized function to check if a number is prime
    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Not a prime number
            }
        }
        return true; // Prime number
    }

    // Function to print the prime factors of a number
    public static void printFactors(int n) {
        for (int i = 2; i <= n; i++) {
            // Check if i is a prime number
            if (isPrime(i)) {
                // While n is divisible by i, print i
                while (n % i == 0) {
                    System.out.print(i + " ");
                    n = n / i; // Reduce n
                }
            }
        }
    }
}
