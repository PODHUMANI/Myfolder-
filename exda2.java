/*Summary Table: All Data Type Conversions
Convert From → To	Syntax
int → double	double d = intValue;
int → float	float f = intValue;
int → long	long l = intValue;
int → short	short s = (short) intValue;
int → byte	byte b = (byte) intValue;
int → String	String str = String.valueOf(intValue);
int → char	char c = (char) intValue;
int → boolean	boolean b = (intValue != 0);
double → int	int i = (int) doubleValue;
double → float	float f = (float) doubleValue;
double → long	long l = (long) doubleValue;
String → int	int i = Integer.parseInt(str);
String → double	double d = Double.parseDouble(str);
String → boolean	boolean b = Boolean.parseBoolean(str);
String → char	char c = str.charAt(0);
boolean → int	int i = boolValue ? 1 : 0;
boolean → String	String str = String.valueOf(boolValue);*/
import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) {
        double real,lmag;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number A:");
        real=s.nextDouble();
        System.out.println("enter the number b:");
        lmag=s.nextDouble();
        System.out.println("add value"+real+"+"+lmag+"i");
    }
} 
import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) {   
Scanner s=new Scanner(System.in);
        System.out.println("enter the year:");
        int year=s.nextInt();
        int a=(year%4);
        if(a==0)
        {
            System.out.println("leap year");
           
        }
        else{
            System.out.println("not leap year");
        }

