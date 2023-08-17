import java.util.*;
class ElectricityBill
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int unit;
float amount,rate=0;
System.out.println("enter units");
unit=sc.nextInt();

if(unit>=0 && unit<=100)
{
	rate=7;
}

else if(unit>=101 && unit<=200)
{
	rate=12;
}

else if(unit>=201 && unit<=300)
{
	rate=15;
}

amount=unit*rate;
System.out.println(" total bill is "+amount);
}
}