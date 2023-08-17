class SingleInhertance1
{
    void showb()
    {
        System.out.println("Inside the base class");
    }
}
class SingleInheritance extends SingleInhertance1
{
    void showc()
    {
        System.out.println("Inside the child class");
    }
    public static void main(String[] args)
    {
        SingleInheritance s1=new SingleInheritance();
        s1.showb();
        s1.showc();
    }
}