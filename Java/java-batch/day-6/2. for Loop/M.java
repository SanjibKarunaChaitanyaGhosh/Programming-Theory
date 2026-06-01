class M{
    public static void main(String[] args) {
        int i=1; // Varibale Declaration with assignment

        for (i=5;i<=10;i++) // 
            System.out.println(i);

        // by default for loop takes one Statement at a time without curly braces 

            System.out.println(i); // clearly this statement is out of the Loop


        int m; // Declaration

        m=10;  // initalization
        m=20;  // Re-assiggment is allowed multiple time

        // int m=30; 
        // RE-declaration, so re-DECLARATION is not allowed.
        System.out.println(m);

        int n;

        for(n=5;n<10;n++)
            System.out.println(n);

        for(n=5;n<10;n++)
            System.out.println(n);
    }
}
