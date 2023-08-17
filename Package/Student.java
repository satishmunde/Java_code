import package.collegeInfo;
class Student
 {
    String id="1032200159";
    String name="Satish Munde";
 void show()
 {
     collegeInfo c1=new collegeInfo();
     c1.show();
     System.out.println("Student Code="+id);
        System.out.println("Student Name="+name);
        
 }
 public static void main(String...args)
 {
    Student s1=new Student();
    s1.show();     
 }
 }