public class sxh {
    public static void main(String[] args) throws Exception {
        for(int i = 1; i < 10; i++) {
                for(int j = 0; j < 10; j++) {
                    for(int k = 0; k < 10; k++) {
                       int ii=i*i*i;
                       int jj=j*j*j;
                       int kk=k*k*k;  
                       int sum=ii+jj+kk;
                       if(sum==i*100+j*10+k) {
                           System.out.println(i*100+j*10+k);
                       }
                    
                }
            }
    }
}
}
