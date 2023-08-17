class HeraInheritance2
{
    void showc1()
    {
        System.out.println("Inside the Frist class");
    }
}
class HeraInheritance1 extends HeraInheritance2
{
    void showc2()
    {
        System.out.println("Inside the Second class");
    }
}
class HeraInheritance extends HeraInheritance2
{
    void showb()
    {
        System.out.println("Inside the child class");

    }
    public static void main(String[] args)
    {
        HeraInheritance h1=new HeraInheritance();
        h1.showb();
        h1.showc1();
        HeraInheritance1 h2=new HeraInheritance1();
        h2.showc2();
        h2.showc1();
    }
}