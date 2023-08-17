import java26.CollegeInfo.*;
class Student
{
int roll=101;
String name="Satish Munde";
CollegeInfo c1=new CollegeInfo();
c1.show();
void show()
{
System.out.println("Student Roll No"+roll);
System.out.println("Student Name"+name);
}
public static void main(String...args)
{
Student s1=new Student();
c1.show();
}
}
