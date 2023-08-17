class Swap1
{
    public static void main(String [] args)
    {
        int a=10,b=5;
        System.out.println("before swap A="+a);
        System.out.println("before swap B="+b);
       // a=a*b;
        //a=a/b;
        //b=a/b;

        a=a+b;
        b=a-b;
        a  =a-b;
        System.out.println("After swap A="+a);
        System.out.println("After swap B="+b);
    }
}