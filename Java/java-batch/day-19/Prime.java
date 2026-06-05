class Prime{
    public static void main(String[] args) {
        int count=0,i=1,n=1;

        while(i<=n){
            if(n%i==0){
                count++;
            }
            i++;
        }
        if(count==2){
            System.out.println("Prime");
        }else{
            System.out.println("NO Prime");
        }
    }
}