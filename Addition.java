import java.util.Scanner;
class Addition
{
  public static void main(String args[])
{
   int num1,num2,sum;
   Scanner Sc=new Scanner(System.in);
   System.out.println("enter a first number");
   num1=Sc.nextInt();
   System.out.println("enter a second number");
   num2=Sc.nextInt();
   sum=num1+num2;
   System.out.println("first number="+num1);
   System.out.println("second number="+num2);
   System.out.println("Addition="+sum);
}
}