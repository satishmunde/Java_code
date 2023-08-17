import java.util.*;
class LeapYear
{
public static void main(String[] args)
{
 
Scanner sc=new Scanner(System.in);
int year;
System.out.println(" Enter a Year to check is it a leap year ");
year=sc.nextInt();
if(year%100==0)
{
	if(year%400==0)
		System.out.println(" it is a leap year ");
	else 
		System.out.println(" it is Not a leap year ");
}
else if(year%4==0)
	System.out.println(" it is leap year ");
else
	System.out.println(" it is Not a leap year ");

}
}