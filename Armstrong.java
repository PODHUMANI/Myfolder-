/*10.Check Armstrong Number between Two Integers?
pqrs... = pn + qn + rn + sn +....
370 = 3*3*3 + 7*7*7 + 0 
   =  27 + 343 + 0
=  370
enter the number :
987
7
8
9
1584
*/
import java.util.*;
import java.io.*;
import java.math.*;
class Main {
    public static void main(String[] args) {
       
    int a,b,c,num, armm=0 ;
    Scanner s=new Scanner(System.in);
    System.out.println("enter the number :");
    a=s.nextInt();
    if(a>0)
    {
        
        for(int i=a;i>0;){
        num=i %10;
     System.out.println(num);
        b=i/10;
        armm +=num * num * num;
       i=b;
    }
        System.out.println(armm);
    }
    }
    
}
