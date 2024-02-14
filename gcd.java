public class gcd {
   public static void main(String[] args) {
       int a=10,b=30;
       int gcds=1;

       for(int i=1;i<=a && i<=b;i++){
        if(a%i==0 && b%i==0)
           gcds=i;
          

       }System.out.println(gcds);
       
   } 
}
