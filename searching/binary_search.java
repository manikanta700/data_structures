public class binary_search {
    public static void main(String[] args){
        int a[]={1,2,3,4};
        int k=4;
        int l=0,r=a.length-1,flag=0;
        int m;
        while(l<=r){
            m=(l+r)/2;
            if(a[m]==k){
                System.out.println(m);
                flag=1;
                break;
            }
            else if(k<a[m]){
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        if(flag==0){
        System.out.println("elelment not there");}
    }
    
}
