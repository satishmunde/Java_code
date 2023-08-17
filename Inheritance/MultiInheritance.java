class MultiInheritance2
{
    void showg()
    {
    System.out.println("Inside grand parent class");
    }
}
class MultiInheritance1 extends MultiInheritance2
{
    void showb()
    {
    System.out.println("Inside Parent class");
    }
}
class MultiInheritance extends MultiInheritance1
{
    void showc()
    {
        System.out.println("Inside the Child class");
    }
    public static void main(String[] args)
    {
        MultiInheritance m1=new MultiInheritance();
        m1.showg();
        m1.showb();
        m1.showc();
    }
}