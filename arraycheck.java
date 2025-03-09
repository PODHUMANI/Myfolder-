public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 5, 5, 5};  // Example array
        
        boolean allSame = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[0]) {   // Compare each element with first element
                allSame = false;
                break;
            }
        }
        
        if (allSame) {
            System.out.println("All elements are the same.");
        } else {
            System.out.println("All elements are not the same.");
        }
    }
}
