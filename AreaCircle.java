import java.util.Scanner;
class AreaCircle
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int r;
double area;
System.out.println(" Enter the Redius of circle");
r=sc.nextInt();
area=r*r*3.14;
System.out.println("The Area of Circle is "+area);
}
}