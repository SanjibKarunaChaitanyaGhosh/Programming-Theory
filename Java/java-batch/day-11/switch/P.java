public class P {
    public static void main(String[] args) {
        int num=10;

        switch(num){
            case 10:
            case 11:
            case 12:
            case 15:
                if(num>5 && num <15){
                    System.out.println("You enter number "+num+" which is between 5 and 20");
                }
            default:
                System.out.println("OTher");
        }

    }
}
