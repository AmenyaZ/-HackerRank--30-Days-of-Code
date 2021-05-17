#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int i = 4;
    double d = 4.0;
    char s[] = "HackerRank ";

int userInt;
double userDouble;
char userChar[100];
scanf("%d%lf",&userInt,&userDouble);
getchar();
scanf("%[^\n]s",userChar);
i=i+userInt;
d=d+userDouble;
printf("%d\n%.1lf\n%s%s",i,d,s,userChar);
    
    // Declare second integer, double, and String variables.
    
    // Read and save an integer, double, and String to your variables.
    
    // Print the sum of both integer variables on a new line.
    
    // Print the sum of the double variables on a new line.
    
    // Concatenate and print the String variables on a new line
    // The 's' variable above should be printed first.

    return 0;
