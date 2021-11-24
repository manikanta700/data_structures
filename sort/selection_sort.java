public class selection_sort {
    public static void main(String[] args){
        int n=5,i,j,min;
        int arr[]={2,5,9,3,6};
        for(i=0;i<n;i++){
            min =i;
            for(j=i;j<n;j++){
                
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for(i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    
}
