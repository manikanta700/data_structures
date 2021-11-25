public class how_meny_times {
        public static void main(String[] args){
            int a[]={6,8,2,1,8,9};
            int i,n=a.length,k=8,c=0;
            for(i=0;i<n;i++){
                if(a[i]==k){
                    c++;
                }
            }
            System.out.println("occurs  "+c+" times");
        
    }
    
}
