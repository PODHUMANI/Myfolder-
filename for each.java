//{ Driver Code Starts

// } Driver Code Ends

//Back-end complete function Template for Java
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String args[]) {
        // Your Code Here
       Scanner sc=new Scanner(System.in);
       String ar=sc.nextLine();
    String[] arr=ar.split("\\s+");
       /* if(ar.charAt(' ')==' ')
        {
            System.out.println();
        }
        System.out.println(ar);
        //{"Hello","World","Geeks","For","Geeks"};*/
       for(String word:arr)
        {
            System.out.println(word);
        }
    }
}


//{ Driver Code Starts.
// } Driver Code Ends
