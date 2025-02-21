import java.util.*;

class Main {
  /*   // 6.Find LCM of Two Numbers?
    public static int gcd(int a, int b) {
        System.out.print("GCD of "+a+" and "+b+" :");
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println(a);
        return a;
    }
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }*/
    /*//ex3 3. Add two Complex Numbers? a+ib Where "a" is real number and "b" is Imaginary number.

     double real, imag;
  Main(double r, double i) {
        this.real = r;
        this.imag = i;
    }
    Main add(Main c) {
        return new Main(this.real + c.real, this.imag + c.imag);
    }
   void display() {
        System.out.println(real + " + " + imag + "i");
    }*/
    public static void main(String[] args) {
        System.out.println("\" BASIC PROGRAM \"");
        Scanner s= new Scanner(System.in);
         Main r=new Main();
         r.ex8(25);
        /*// ex1
        System.out.println("a :");
        int a=s.nextInt();
        System.out.println("b :");
        int b=s.nextInt();
        Main r=new Main();
        r.ex1(a,b);
       //ex2
        System.out.println("binary1 :");
        String s1=s.nextLine();
        System.out.println("binary2:");
        String s2=s.nextLine();
        r.ex2(s1,s2);
        //ex3
        Main c1 = new Main(3, 2);
        Main c2 = new Main(1, 7);
        Main sum = c1.add(c2);
        System.out.print("Sum: ");
        sum.display();*/
        //ex4
       // System.out.println("enter the number :");
       /* int n=s.nextInt();
        r.ex41(n);
        r.ex42(n);*/
 //5.Largest of three Numbers? Input: x = 7, y = 20, z = 56 Output: 56
      /*  int a=4;
        int b=5;
        int c=8;
        String d=(a>b)?((a>b)?"a":"b"):((b>c)?"b":"c");
        System.out.println("largest number :"+d);*/
       /* System.out.print("Enter first number: ");
        int num1 = s.nextInt();
        System.out.print("Enter second number: ");
        int num2 = s.nextInt();
         int result = lcm(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + result);*/
        s.close();
    }
//8.Display All Prime Numbers from 1 to N? Input: N = 11 Output: 2, 3, 5, 7, 11
public static int ex8(int N){
System.out.println("Prime numbers from 1 to " + N + " are:");
        for (int num = 2; num <= N; num++) {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.print(num + " ");
        }
        return 0;
}
   // 4.Given Integer is Odd or Even? Input : 13 Output: ODD Input : 24 Output: EVEN
   public static  int ex42(int n){
   
       String n2=((n%2)==0)?"even":"odd";
       System.out.println(n2);
       return 0;
   }
public static  int ex41(int n){
    if((n%2)==0)
    System.out.println("number is \"even\"");
    else
    System.out.println("number is \"odd\"");
    return n;
}
    //ex1.Swap Two Numbers ? Input  : m=9, n=5 Output : m=5, n=9
 public static int ex1(int a,int b)
    {
       a=a+b;
       b=a-b;
       a=a-b;
       System.out.println("a :"+a+"\nb :"+b);
  return (a+b);
 }
 // ex22.Add Two Binary Strings? Input :  x = "10", y = "01" Output: "11" Input :  x = "110", y = "011" Output: "1001" Explanation:
    //  110
    //+ 011
public static  String ex2(String s1,String s2) {
        int length1=s1.length();
        int length2=s2.length();
        Integer max =Math.max(length1,length2);
        s1 =String.format("%"+max+"s",s1).replace(" ","0");
        s2 =String.format("%"+max+"s",s2).replace(" ","0");
         StringBuilder result = new StringBuilder();
        int carry = 0;
        for (int i = max - 1; i >= 0; i--) {
            int bit1 = s1.charAt(i) - '0';
            int bit2 = s2.charAt(i) - '0';

            int sum = bit1 + bit2 + carry;
            result.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) {
            result.append(carry);
        }

        System.out.println("output"+ result.reverse().toString());
return s1;
 }
}
