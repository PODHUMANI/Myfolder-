//{ Driver Code Starts
// Initial Template for Java
import java.util.*;


// } Driver Code Ends

// User function Template for Java
class Solution {
    public static int[] rowSum(int mat[][]) {
        //int[] arr=mat.c
        List<Integer> sums=new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            int sum=0;
            for(int j=0;j<mat[i].length;j++){
                sum+=mat[i][j];
            }
            sums.add(sum);
        }
        int[] arr=sums.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
}


//{ Driver Code Starts.

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int mat[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) mat[i][j] = sc.nextInt();
            }
            Solution sln = new Solution();
            int ans[] = sln.rowSum(mat);
            for (int i = 0; i < n; i++) System.out.print(ans[i] + " ");
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends
