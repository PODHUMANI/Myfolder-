//{ Driver Code Starts
// Initial Template for Java
import java.util.*;


// } Driver Code Ends

// User function Template for Java
class Solution {
    public static String magicSquare(int mat[][]) {
        // Your Code here
        List<Integer> same=new ArrayList<>();
        for(int i=1;i<mat.length;i++){
            for(int j=1;j<mat.length;j++){
            if(mat[i][j]==mat[0][0]){
                return "Not a Magic Square";
            }}
        }
        int r=mat.length;
        int c=mat[0].length;
        int sum;
        for(int i=0;i<r;i++){
         sum=0;
            for(int j=0;j<c;j++){
                sum+=mat[i][j];
            }
            same.add(sum);
           // System.out.println(sum);
        }
                for(int i=0;i<c;i++){
             sum=0;
            for(int j=0;j<r;j++){
                sum += mat[i][j];
            }
            same.add(sum);
           // System.out.println(sum);
        }
        sum=0;
                for(int i=0;i<r;i++){
            
            for(int j=0;j<=i;j++){
                if(i==j){
                sum+=mat[i][j];
                }
            }
            
        }
        same.add(sum);
        sum=0;
        for(int i=0;i<r;i++){
                sum+=mat[i][r-1-i]; // System.out.println(sum);
                           }
             same.add(sum);
            
            //System.out.println(sum);
        String aleq=(same.stream().distinct().count()==1)?"Magic Square":"Not a Magic Square" ;
    return aleq;
    }
}


//{ Driver Code Starts.

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int mat[][] = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) mat[i][j] = sc.nextInt();
            }
            Solution sln = new Solution();
            String s = sln.magicSquare(mat);
            System.out.println(s);
        }
    }
}
// } Driver Code Ends
