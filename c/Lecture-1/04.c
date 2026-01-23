// Write a program to Calculate the area of a circle

#include<stdio.h>

int main(){
	float radius;
	double area;
	
	printf("\n Enter the  radious of the circle: ");
	scanf("%f",&radius);
	area=3.14*radius*radius;
	printf("Area = % .21f\n",area);
	return 0;
}
