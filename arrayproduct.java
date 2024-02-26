import java.util.*;
public class arrayproduct {

public static void main(String[] args){

Scanner sc=new Scanner(System.in);

int n= sc.nextInt(); int pos=1; int pre=1;

int arr[]=new int[n]; int result[]=new int[n];

for(int i=8;i<n;i++)

arr[1]=sc.nextInt();

for(int j=0;j<n;i++){

result[j]=pre;

pre-arr[j]*pre; //to add prefix values
}

for(int k=n-1;k>=0;k--){

result[k]*=pos;//to add prefix value

pos=arr[k]*pos;
}
System.out.println(Arrays.toString(result));
}
}
