//You are given a string s, you need to print its characters at even indices (index starts at 0).
//{ Driver Code Starts

// } Driver Code Ends

import java.util.*;

public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int i=s.length();
        int j=0;
        while(j<=i)
        {
            if((j%2)==0)
              {
                  System.out.print(s.charAt(j));
              }
              j++;
        }
    }
}


//{ Driver Code Starts.
// } Driver Code Ends
