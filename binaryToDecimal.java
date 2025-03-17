//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.binaryToDecimal(str);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int binaryToDecimal(String b) {
        // Code here
        //n*2^r=decimal
        int r=1,n=0;
        for(int i=b.length()-1;i>=0;i--)
        {
            n+=(b.charAt(i)-'0')*r;
            r=r*2;
        }return n;
    }
}
