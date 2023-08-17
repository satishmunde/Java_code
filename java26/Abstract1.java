abstract class Parent
{
    abstract void show();
}
class Abstract1 extends Parent
{
    void show()
    {
        System.out.println(" inside show");
    }
    public static void main(String...args)
    {
        Abstract1 s1=new Abstract1();
        s1.show();
    }
}