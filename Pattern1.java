public class Pattern1{
    public static void main(String args[]){
        int n=5;
        int p=n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==i){
                    if(i>n/2){
                        System.out.print(i);
                    }
                    else{

                    System.out.print(p-i);}
                } else if(j==p-i){
                    if(i>n/2){
                        System.out.print(j);
                    }
                    else{
                        System.out.print(i);
                    }
                    
                }
              else
                System.out.print(" ");
}System.out.println();

     }
 
    }
}
