import CollegeInfo.UniInfo;
import CollegeInfo.CollegeInfo;
class Student
{
int roll=101;
String name="Satish Munde";
void display()
{

UniInfo u1=new UniInfo();
u1.show();


CollegeInfo c1=new CollegeInfo();
c1.show();

System.out.println("Student Roll No "+roll);
System.out.println("Student Name "+name);
}
public static void main(String...args)
{
Student s1=new Student();
s1.display();
}
}
