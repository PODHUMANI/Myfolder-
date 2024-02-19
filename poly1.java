public class poly1 {

    public static void main(String[] args) {
        int n=100600;
        String m=Integer.toString(n);
        char[] ch=m.toCharArray();    
   for(int i=0;i<ch.length;i++){
            if(ch[i]=='0')
               ch[i]='5';
        
        }String string = new String(ch); 
      var j=Integer.parseInt(string);
               System.out.print(j);
              // System.out.println(typeOf(j));

    }

   
}
