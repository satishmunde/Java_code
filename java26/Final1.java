class Parent
{
    final void marriage()
    {
        System.out.println("Marry with XYZ");
    }
}
class Final1 extends Parent
{
    void marriage()
    {
        System.out.println("marry with abc");
    }
    public static void main(String...args)
    {
        Final1 f1=new Final1();
        f1.marriage();
    }
}