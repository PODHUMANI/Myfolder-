import java.util.Scanner;

public class BitwiseBinaryAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("முதல் முழு எண்ணை (Integer) உள்ளிடவும்: ");
        int num1 = scanner.nextInt();

        System.out.print("இரண்டாவது முழு எண்ணை (Integer) உள்ளிடவும்: ");
        int num2 = scanner.nextInt();

        // Bitwise addition
        while (num2 != 0) {
            int carry = num1 & num2;
            num1 = num1 ^ num2;
            num2 = carry << 1;
        }

        // Convert result to binary
        String binarySum = Integer.toBinaryString(num1);
        System.out.println("பைனரி கூட்டல் முடிவு: " + binarySum);

        scanner.close();
    }
}
