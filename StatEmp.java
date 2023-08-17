class StatEmp
{
    int id;
    String name;
    static String company="Infosys";

    StatEmp(int eid,String ename)
    {
        id=eid;
        name=ename;

    }
     void show()
    {
        System.out.println("Employee Namee ="+name);
        System.out.println("Employee id ="+id);
        System.out.println("Employee Company Name="+company);
    }
    public static void main(String [] args)
    {
        StatEmp e1=new StatEmp(1001,"Satish Munde");
        e1.show();
    }
}