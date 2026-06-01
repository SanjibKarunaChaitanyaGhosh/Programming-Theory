
public class Q {
    public static void main(String[] args) {

        int num=10;
        // we can't use condition within case instad of constant values
        switch(num){
            case (num>6 && num<=10):
                System.out.println("This logical case is Executed");

            case (num>=1 && num<=6):
                System.out.println("This logical case 1 to 6");
                break;

            default:
                System.out.println("Please Enter a number from 1 to 10") ;
        }
    }
}
