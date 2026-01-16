#include<stdio.h>
main()
{
    int a;
    float b;
    char c;
    printf("Enter an inter: ");
    scanf("%d",&a);
    printf("Enter a float number:");
    scanf("%f",&b);
    printf("Enter a char:");
    scanf(" %c",&c); // space before ( %c) is IMPORTANT
    /* When you enter a number and press Enter, this happens: 10↵
    What actually goes into memory (input buffer): '1'  '0'  '\n'
    👉 \n (newline) is created when you press Enter 
    %d and %f do not consume the \n

    %c reads exactly one character

    So %c reads the leftover newline \n

    Result: c becomes '\n' instead of your character 😬  */
    printf("Interger: %d,float: %f,Character: %c",a,b,c);

}