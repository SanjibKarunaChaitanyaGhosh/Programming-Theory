// Write a program to enter a number and then print if it is even or odd

#include<stdio.h>
main()
{
    int n,r;
    printf("Enter a number :");
    scanf("%d",&n);
    r=n%2;
    if(r==0){
        printf("The given number %d is Even\n",n);
    }else{
        printf("The given number %d is odd\n",n);
    }

}