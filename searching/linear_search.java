public class linear_search{
    public static void main(String[] args){
        int a[]={6,3,2,1,8,9};
        int i,n=a.length,k=8;
        for(i=0;i<n && a[i]!=k;i++);
        System.out.println("found at the index "+i);
    }
}