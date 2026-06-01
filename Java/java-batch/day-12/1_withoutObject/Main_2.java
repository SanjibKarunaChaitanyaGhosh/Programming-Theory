class Main_2 {
    //Create method 
    public static int mySum (int x , int y){
        return x + y;
    }

    // Usage of a static method: You can call a static method directly using the class name, without creating an object of the class.
    
    public static void main(String[] args) {
        int result= Main_2.mySum(10,20);
        System.out.println(result);
    }
}