public class pro1{
    public static void main(String[]args){
        int arr[]={23,34,15,51,65};
        int first=0;
        int second=0;
        for(int i=0;i<5;i++){
            if(arr[i]>first){
                first=arr[i];
            }
  }
  for(int i=0;i<5;i++){
    if(arr[i]<first && arr[i]>second){
        second=arr[i];
    }


}  System.out.println(" second big number is :"+second);
    }
}
