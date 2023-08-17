class Base
{
    int x=100;
    Base()
    {
        System.out.println("Inside the Base constructor");
    }
   void show()
    {
        System.out.println("Value of x ="+x);
        System.out.println("Inside the base class");
    }
}
class Super1 extends Base
{
    int x=200;
    Super1()
    {
        super();
        System.out.println("Inside the base constructor");
    }
    void show()
    {
        super.show();
        System.out.println("Value of  Super x="+super.x);
        System.out.println("Value of x="+x);
        System.out.println("Inside the Super class");
    }
    public  static void main(String...args)
    {
        Super1 s1=new Super1();
        s1.show();
    }
}