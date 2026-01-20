// Write a program to find the maximum between two numbers

#include<stdio.h>
main()
{
    int a,b;
    printf("Enter first number:");
    scanf("%d",&a);
    printf("Enter second number:");
    scanf("%d",&b);
    if(a>b){
        printf("First number that is %d is larger than %d",a,b);
    }else if(b>a){
        printf("Second number that is %d is larger than %d",b,a);
    }else{
        printf("First number that is %d is equal to Second number %d",a,b);

    }
}