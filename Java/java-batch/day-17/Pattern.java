    //   1             2*i+1 , i=0,  1
    //  111            2*i+1,  i=1,  3
    // 11111           2*i+1,  i=2,  5
// class Pattern{
//     public static void main(String[] args) {
//         int rows=3;
//         for(int i=1;i<=rows;i++){
//             for(int j=1;j<=rows-i;j++){
//                 System.out.print("**");
//             }
//             for(int k=1;k<=2*i-1;k++){
//                 System.out.print("1 ");
//             }
//             System.out.println();
//         }
//     }
// }

class Pattern{
    public static void main(String[] args) {
      for (int i=0;i<3;i++){
        for( int j=0;j<i+1;j++){
            System.out.print("*");
        }
        System.out.println(1);
        }
    }
}
    

