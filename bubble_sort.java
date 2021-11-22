class bubble_sort{
    public static  void main(String[] args){
        int n=5,i,j,temp,swp=1;
        int arr[]={32,42,33,12,4};

        for(i=0;i<n&&swp==1;i++){
            swp=0;
            for(j=0;j<n-1;j++){
                
                if(arr[j]>arr[j+1]){
                     temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swp=1;
                }
            }
        }
        for(i=0;i<n;i++){
          System.out.println(arr[i]);
       }
        
    } 
}

