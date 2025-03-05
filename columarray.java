//{ Driver Code Starts
// Initial Template for Java
import java.util.*;


// } Driver Code Ends

// User function Template for Java
class Solution {
    public static int[] colSum(int mat[][]) {
        // Your Code Here
        List<Integer> sums=new ArrayList<>();
        int row=mat.length;
        int clom=mat[0].length;
        for(int j=0;j<clom;j++){
            int sum=0;
            for(int i=0;i<row;i++){
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
            int ans[] = sln.colSum(mat);
            for (int i = 0; i < m; i++) System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends
