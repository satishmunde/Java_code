class HyInheritance3
{
    void show3()
    {
        System.out.println("Inside the First class");
    }
}
class HyInheritance2 extends HyInheritance3
{
    void show2()
    {
        System.out.println("Inside the Second class");
    }
}
class HyInheritance1 extends HyInheritance3
{
    void show1()
    {
        System.out.println("Inside the Third class");
    }
}
class HyInheritance extends HyInheritance2
{
    void show()
    {
        System.out.println("Inside the Fourth class");
    }
    public static void main(String[] args)
    {
        HyInheritance h1=new HyInheritance();
        
        h1.show();
        h1.show2();
        h1.show3();

        HyInheritance1 h2=new HyInheritance1();
        h2.show1();
        h2.show3();
        
    }
}