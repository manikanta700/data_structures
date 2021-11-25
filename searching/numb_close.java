import java.lang.Math;
public class numb_close {
        public static void main(String[] args){
            int a[]={1,4,6,9,11,15,18};
            int k=8;
            int l=0,r=a.length-1,flag=0;
            int m=0;
            if(k<a[0]){
                System.out.println(a[0]);
            }
            else if(k>a[r]){
                System.out.println(a[r]);
            }
            else{
            while(l+r>1 && l<=r){
                m=(l+r)/2;
                if(k<a[m]){
                    r=m-1;
                }
                else if(k>a[m]){
                    l=m+1;
                }
            }
            if((Math.abs(a[l]-k))<(Math.abs(a[r]-k))){
                System.out.println(Math.abs(a[l]));
            }
            else{
            System.out.println(a[r]);
            }
            
           

        
            
          }  
        }
        
    
    
}
