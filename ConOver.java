class ConOver
{
    int x;
    float y;
    String n;
    ConOver(int x)
    {
        this.x=x;
        System.out.println("Value of X is ="+x);
        System.out.println("Inside this constructor");
        System.out.println("---------------------------------------------------");
    }
    ConOver(int x,float y)
    {
        this.x=x;
        this.y=y;
        System.out.println("Value of X is ="+x);
         System.out.println("Value of Y is ="+y);
        System.out.println("Inside this constructor");
        System.out.println("---------------------------------------------------");
    }
    ConOver(int x,float y,String n)
    {
         this.x=x;
        this.y=y;
        this.n=n;
        System.out.println("Value of X is ="+x);
         System.out.println("Value of Y is ="+y);
         System.out.println("Value of N is "+n);
        System.out.println("Inside this constructor");
        System.out.println("---------------------------------------------------");

    }
   
    public static void main(String[] args)
    {
        ConOver c1=new ConOver(26);
        ConOver c2=new ConOver(26,9.83f);
        ConOver c3=new ConOver(26,9.83f,"Satish Munde");
    }
}