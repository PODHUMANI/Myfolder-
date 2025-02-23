class Main {
    public static void main(String[] args) {
        int n=5;
        String[] st={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
      //  StringBuilder str= new StringBuilder(st).reverse();
        
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++)
            {
                System.out.print(st[j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<=n;i++){
            for(int j=n;j>=i;j--)
            {
                System.out.print(new StringBuilder(st[i]).reverse()+" ");
            }
            System.out.println();
        }
    }
}
