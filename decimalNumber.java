class GFG {
    public static void decToBin(int n) {
        String s = ""; 

        while (n > 0) {
            s = (n % 2) + s; 
            n = n / 2;       
        }

        System.out.println("Binary representation: " + s); 
    }

    public static void main(String[] args) {
        int decimalNumber = 10; 
        decToBin(decimalNumber); 
    }
}
