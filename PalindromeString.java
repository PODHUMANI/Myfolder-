//{ Driver Code Starts
// Initial Template for Java

import java.io.*;

class GFG {

    
// } Driver Code Ends

// User function Template for Java

// function to check if s is palindrome
// It should return true is the given
// string is palindrome otherwise false
public static boolean isPalindrome(String s) {
    // code here
  /*  char[] ch=s.toCharArray();
  //  Arrays.reva
  for(int i=s.length()-1;i>=0;i--){
      char[] ch1=new char[s.length()];
      ch1=s.toCharArray(i);
      String s1=new String(ch1);
      if(ch1.length()==ch.length()){
          
          return s1.equals(s);
      }
      
  }return false;
  */
  //StringBuilder s1=new StringBuilder(s);
  if(s.length()>0){
     // return false;
  
  StringBuilder s1=new StringBuilder(s);
  //s=new String(s);
  return s.equalsIgnoreCase(s1.reverse().toString());
      
  }return false;
}



//{ Driver Code Starts.

    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {

            String s = read.readLine().trim();

            boolean palindrome = isPalindrome(s);
            if (palindrome)
                System.out.println("True");
            else
                System.out.println("False");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends
