import java.util.*;
class  Converter
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int km,m;
int ch;
System.out.println(" Enter your choice");
System.out.println("Press 1 For Kilo Meter to Meter ");
System.out.println("Press 2 For Meter To Kilo Meter");
ch=sc.nextInt();
if(ch==1)
{
	System.out.println("\n Please Enter Distance in Kilo Meter ");
	km=sc.nextInt();
	m=km*1000;
	System.out.println("\n The Given Distance in Meter is\t"+m);

}

else if(ch==2)
{
	System.out.println("\n Please Enter Distance in Meter ");
	m=sc.nextInt();
	km=m/1000;
	System.out.println("\n The Given Distance in Meter is\t"+km);

}
else
{
	System.out.println("\n Invalaid option");
}

}
}