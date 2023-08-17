import java.util.*;
class Guess
{
public static void main(String[] args)
{
int num,guess,nguess=0;
Scanner sc=new Scanner(System.in);
Random rand=new Random();
num=rand.nextInt(100);
System.out.println(num);
do
{
System.out.println(" Guess a number");
guess=sc.nextInt();
if(num>guess)
{
    System.out.println("Enter a Higher Number");
}
else if(num<guess)
{
    System.out.println("Enter a Lower Number");
}
 nguess++;
}while(num!=guess);
System.out.println("You Guess the Number in "+nguess);
}
}