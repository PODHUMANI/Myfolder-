import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int mark=sc.nextInt();
		Codechef.greater(mark);
		 mark=sc.nextInt();
		Codechef.greater(mark);
		 mark=sc.nextInt();
		//mark=
	 Codechef.greater(mark);
     
	}
	public static void  greater(int mark){
		if(mark>90){
		    System.out.println("A");
		}else if(mark>70){
		    System.out.println("B");
		}else if(mark>=40){
		    System.out.println("C");
		}else{
		    System.out.println("F");
		}
	}
}
