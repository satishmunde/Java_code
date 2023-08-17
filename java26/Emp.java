import Company.Company;
class Emp
{
int id=1234;
String name="Satish Munde";

void show1()
{
Company c1=new Company();
c1.show();
System.out.println(" Emp Id"+id);
System.out.println(" Emp Name"+name);
}
public static void main(String...args)
{
Emp e1=new Emp();
e1.show1();
}
}