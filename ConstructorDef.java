class ConstructorDef
{
    int x;
    String y;

    ConstructorDef()
    {
        x=26;
        y="Sattu";
    }
    void show()
    {
        System.out.println("value of X="+x);
        System.out.println("value of Y="+y);
        
    }
    public static void main(String[]args)
    {
        ConstructorDef c1=new ConstructorDef();
        c1.show();
    }
}