
 class A5P1{
    public static void main(String[] args){
        int n = 16;
        for(int i=1;i<=16;i++){
            int flag1=0;
            for(int j=2;j<=(int)Math.sqrt(i);j++){
                if(i%j==0){
                    flag1=1;
                }
            }
            if(flag1==0){
                for(int k=1;k<=16;k++){
                    int flag2=0;
                    for(int m =2;m<=(int)Math.sqrt(k);m++){
                        if(k%m==0){
                            flag2=1;
                        }
                    }
                    if(flag2==0){
                        if((i+k)==n){
                            System.out.println("Sum of "+i+" and "+k+" is "+n);
                        }
                    }

                }
            }
        }
    }
}
