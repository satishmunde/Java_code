class BSuper
{
int num=1200;
String Name="Munde Satish";

void show()
{
System.out.println(" Value of num "+num);
System.out.println(" Value of name "+Name);
}
BSuper()
{
System.out.println("Inside the BSuper Constructor");
}
}
class ASuper extends BSuper
{
int num=100;
String Name="Satish Munde";
ASuper()
{
super();

System.out.println("Inside the Asuper Constructor");
}
void show()
{
super.show();
System.out.println(" Value of num "+super.num);
System.out.println("Name is "+super.Name);
System.out.println(" Value of num "+num);
System.out.println("Name is "+Name);
}
public static void main(String...args)
{
ASuper s1=new ASuper();
s1.show();
}
}