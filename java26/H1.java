interface House
{
void color();
void area();
}
class H1 implements House
{
public void color()
{
System.out.println(" color is yellow");
}
public void area()
{
System.out.println(" Area is 2600 square feet");
}
public static void main(String...args)
{
H1 e=new H1();
e.color();
e.area();
}
}
