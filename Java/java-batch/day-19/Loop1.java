class Loop1{
    public static void main(String[] args) {
        for(int i=1;i<15;i++){
            System.out.println(i); //i=1,i=10
            if(i==10){
                break;
            }
        }


        for(int i=1;i<15;i++){

            System.out.println(i+"hello");
            if(i==10){
                continue;
            }
            System.out.println(i); //i=1,i=10
            
        }
    }
}