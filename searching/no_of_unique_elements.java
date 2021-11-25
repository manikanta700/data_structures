public class no_of_unique_elements {
    public static void main(String[] args){
        int a[]={2,2,3,4,5,6};
        int c=0,i,j;
        int n=a.length;
        for(i=0;i<n;i++){
            for(j=i+1;j<n && a[i]!=a[j];j++);
            if(j==n){
                c+=1;
            }
        
            }
            System.out.println(c);
}
}
