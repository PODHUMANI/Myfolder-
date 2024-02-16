public class snake {
    public static void main(String[] args) {
        int mat[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int rows=0;
        int col=0;
        int colend=mat[0].length-1;
        int rowend=mat.length-1;
        while(rows<=rowend && col<=colend){
            
        for(int i=col;i<=colend;i++){
            
            System.out.print(mat[rows][i]+" ");
        }rows++;
        System.out.println();
      for(int i=colend;i>=col;i--){
  System.out.print(mat[rows][i] +" ");
       }rows++;
       System.out.println();
    }
}}
