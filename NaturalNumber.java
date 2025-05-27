import java.util.Scanner;
class NaturalNumber
{
public static void main(String[] args)
{
int number, n;
int sum = 0;
Scanner input = new Scanner(System.in);
// get a number from user
System.out.print("Enter number to check if it is whole number or not");
number = input.nextInt();
if(number>0)
{
System.out.println("The number is a natural number");
}
else
{
System.out.println("It is a not a natural number");
}
System.out.print("enter the value for n:");
n = input.nextInt();
for(int a = 1; a<=n; a++)
{
sum = sum + a;
}
System.out.println("the sum of numbers is:" + sum);
input.close();
}}
