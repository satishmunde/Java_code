import java.util.*;
class ConstructorParaUser
{
    int roll;
    String name;

    ConstructorParaUser()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter roll");
        roll=sc.nextInt();
        System.out.println("enter name");
        name=sc.nextLine();

    }
    void show()
    {
        System.out.println("your roll number is "+roll);
        System.out.println("Your name is "+name);
        
    }
    public static void main(String[] args)
    {
        
        ConstructorParaUser c1=new ConstructorParaUser();
        c1.show();
    }
}