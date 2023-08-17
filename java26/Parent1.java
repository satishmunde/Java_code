class Parent
{
    int x=100;
    void show()
    {
        System.out.println("Value of x ="+x);

    }
}
class Parent1 extends Parent
{
    int y=200;
    void display()
    {
        System.out.println("Value of y+"+y);
    }
     public static void main(String[] args)
    {
        Parent1 c1=new Parent1();
        c1.show();
        c1.display();
    }
}