// Write a program to read a character in upper case and then print it in lower case.


#include<stdio.h>

int main(){
	char ch;
	printf("\n Enter any charcter in upper case :");
	scanf("%c",&ch);
	printf("\n The character in lower case is : %c",ch+32);
	return 0;
}
