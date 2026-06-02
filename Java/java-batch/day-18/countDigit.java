class countDigit{
    public static void main(String[] args) {
        int number =12345, digit=0, count=0; // number =12 , 1

        while (number > 0){

            count++;

            digit=number%10;

            System.out.println(digit);  // 3, 2 , 1

            number=number/10; // 12 , 1 , 0

        }
        System.out.println("\nTotal number of digits within given number = "+count);
    }
}