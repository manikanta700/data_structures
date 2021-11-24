public class insertion_sort {
    public static void main(String[] args){
        int a[]={8,5,3,7,4};
        int n=5,i,j,temp;
        for(i=1;i<n;i++){
            temp=a[i];
            j=i-1;
            while(j>=0 && a[j]>temp){
                    a[j+1]=a[j];
                    j--;     
            }
            a[j+1]=temp;
        }
        for(i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}
