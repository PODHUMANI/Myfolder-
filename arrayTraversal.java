//{ Driver Code Starts
// Initial Template for Java

import java.util.Scanner;

class Main {

    
// } Driver Code Ends

// User function Template for Java

public static void arrayTraversal(int[] arr) {
    // Write your code below
for(int i=0;i<arr.length;i++)
{
    System.out.print(arr[i]+" ");
}
    // Don't provide the new line
}


//{ Driver Code Starts.

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }
            arrayTraversal(arr);
            System.out.println();

            System.out.println("~");
        }
        scn.close();
    }
}
// } Driver Code Ends
