class ConsOverl
{
    int x;
    float a;
    String str;

    ConsOverl()
    {
        System.out.println("Inside Default Connstructor");
    }
    ConsOverl(int x)
    {
        this.x=x;
        System.out.println("Value of X ="+x);
    }
   /* ConsOverl(int x int y)
    {
        this.x=x;
        this.y=y;
        System.out.println("Value of X ="+x);
        System.out.println("Value of Y ="+y);
    }*/
    ConsOverl(int x,float a )
    {
        this.x=x;
        this.a=a;
        System.out.println("Value of x ="+x);
        System.out.println("Value of a ="+a);
    }
    ConsOverl(int x,float a,String str)
    {
        this.x=x;
        this.a=a;
        this.str=str;
        System.out.println("Value of x ="+x);
        System.out.println("Value of  A="+a);
        System.out.println("Value of Str ="+str);
    }
    
    public static void main(String[] args)
    {
        ConsOverl c1=new ConsOverl();
        ConsOverl c2=new ConsOverl(26);
        ConsOverl c3=new ConsOverl(26,9.83f);
        ConsOverl c4=new ConsOverl(26,9.83f,"Satish Munde");
        
    }
}