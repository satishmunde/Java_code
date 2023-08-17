class Mul1
{
    int x=1;
    void show1()
    {
        System.out.println("Value of x ="+x);
        System.out.println(" Inside the mul1 class");
    }
}
class Mul2 extends Mul1
{
    int y=2;
    void show2()
    {
        System.out.println(" Value of y="+y);
        System.out.println("Inside the Mul2 class");
    }
}
class Mul extends Mul2
{
    int z=3;
    void show()
    {
        System.out.println(" Value of Z="+z);
        System.out.println("Inside the mul Class");
    }
    public static void main(String...args)
    {
        Mul m1=new Mul();
        m1.show1();
        m1.show2();
        m1.show(); 
    }
}