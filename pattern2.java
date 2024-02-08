public class pattern2{
    public static void main(String args[]){
        String str="PATTERN";
        char[] ch = str.toCharArray();
        int n=ch.length;
       // int n=5;
        int p=n-1;
        for( int i=0;i<ch.length;i++){
            for(int j=0;j<ch.length;j++){
                if(j==i){
                    if(i>n/2){
                        System.out.print(ch[i]);
                    }
                    else{

                    System.out.print(ch[i]);}
                } else if(j==p-i){
                    if(i>n/2){
                        System.out.print(ch[j]);
                    }
                    else{
                        System.out.print(ch[p-i]);
                    }
                    
                }
              else
                System.out.print(" ");
}System.out.println();

     }
 
    }
}
