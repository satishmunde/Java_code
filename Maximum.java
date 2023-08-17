import java.util.*;
class Maximum
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int num1,num2,num3;
System.out.println(" Enter First Number ");
num1=sc.nextInt();

System.out.println("Enter Second Number ");
num2=sc.nextInt();

System.out.println("Enter Third Number ");
num3=sc.nextInt();

if(num1>num2&&num1>num3)
{
	System.out.println(" First Number is biggest "+num1);
}
else if(num2>num1&& num2>num3)
{
	System.out.println(" Second Number is biggest "+num2);
}
else
{
System.out.println("Third Number is Biggest "+num3);
}
}
}