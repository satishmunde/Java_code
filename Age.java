import java.util.*;
class Age
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int cy,by,age;
System.out.println(" Please Enter The Current year");
cy=sc.nextInt();
System.out.println(" Please Enterr Your Birth Year");
by=sc.nextInt();

age=cy-by;

if(age<=17)
{
	System.out.println(" You Are child and not eligible for Licence");
	System.out.println(" \n Your Age is "+age);
}

else if(age<=60)
{
	System.out.println(" You are Young and you are eligible for Licence");
	System.out.println(" \n Your Age is "+age);
}

else
{
	System.out.println(" You are elder person your have to take a rest ");
	System.out.println(" \n Your Age is "+age);
}

}
}