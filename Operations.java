import java.util.*;
class Operations
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int ch,a,b,c;
System.out.println(" Enter First Number ");
a=sc.nextInt();
System.out.println(" Enter Second Number");
b=sc.nextInt();

System.out.println(" Enter Your choice");
System.out.println(" \n Press 1 For Addition");
System.out.println(" \n Press 2 For Substraction");
System.out.println(" \n Press 3 For Multiplication");
System.out.println(" \n Press 4 For Division");
ch=sc.nextInt();

if(ch==1)
{
	System.out.println(" \n The Additon of two Number"+a+b);
}

else if(ch==2)
{
	c=a-b;
	System.out.println(" \n The Substration of two Number"+c);
}
else if(ch==3)
{
	System.out.println(" \n Multiplication of two Number "+a*b);
}
else if(ch==4)
{
	System.out.println(" \n The Division of two Number "+a/b);
}
else
{
	System.out.println(" Invalaid operation");
}







}
}