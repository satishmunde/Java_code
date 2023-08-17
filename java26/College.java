// inner class


class College
{
int clgcode=159;
String clgName="MGM's College of CS and IT";

class Students
{
int roll=101;
String name="Satish Munde";

void show()
{

System.out.println(" College Code "+clgcode);
System.out.println("College Name is "+clgName);
System.out.println("Roll of Student"+roll);
System.out.println("Name is "+name);
}
}
public static void main(String[] args)
{
College.Students b1=new College().new Students();
b1.show();
}
}