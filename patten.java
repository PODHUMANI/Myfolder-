import java.util.*;

class Main {
    public static void main(String[] args) {
      //  Scanner s=new Scanner(System.in);
    //int n=s.nextInt();
    int n=8;
    for(int i=1;i<n;i++)
    {
        for(int j=1;j<n-i;j++)
        {
        System.out.print(" ");
            
        }
        for(int p=1;p<=(2*i-1);p++){
            System.out.print("*");
        }
        System.out.println();
    }
    
    }
}
