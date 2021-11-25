public class numb_frequency {
    public static void main(String[] args){
        int a[]={3,2,1,3,4,5,6,5};
        int i,j,temp,n=a.length,c=1;
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
            if(i!=n-1 && a[i]==a[i+1]){
                c++;
            }
            else{
                System.out.println(a[i]+" present "+c+" times");
                c=1;
            }
        }

    }
}
