class StaticMember
{
    int roll;
    String name;
    static String clgname="MGM's";

    StaticMember(int sroll,String sname)
    {
        roll=sroll;
        name=sname;
    }
    void show()
    {
        System.out.println("Roll Number is ="+roll);
        System.out.println("Student Name is ="+name);
        System.out.println("College Name is ="+clgname);
        System.out.println("----------------------------------------");
        
    }
    public static void main(String[] args)
    {
        StaticMember s1=new StaticMember(101,"Satish Munde");
        StaticMember s2=new StaticMember(102,"Vishnu");
        StaticMember s3=new StaticMember(103,"Vijay");
       s1.show();
       s2.show();
       s3.show();
      
    } 
}