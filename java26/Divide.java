class Divide
{
public static void main(String...args)
{
int x=100;
int c=0;
try
{
c=x/0;}
catch(Exception e1)
{
System.out.println(" the Exception is ="+e1);
}
System.out.println("Ans is ="+c);
}
}


