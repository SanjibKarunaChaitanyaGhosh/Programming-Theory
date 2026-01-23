// Write a Program to awap two number using temporary variable.

#include<stdio.h>

int main(){
	int num1,num2,temp;
	
	printf("\n Enter the first number :");
	scanf("%d",&num1);
	printf("\n Enter the Second number :");
	scanf("%d",&num2);
	
	// using Tempurary variable
	temp=num1;
	num1=num2;
	num2=temp;

	printf("The num1 is %d",num1);
	printf("The num2 is %d",num2);
}
