class Employee
{
    int id=26;
}
class Employee1 extends Employee
{
    String name="Satish Munde";
    public static void main(String[] args)
    {
       //Employee emp=new Employee();
        Employee1 emp1=new Employee1();
        System.out.println(emp1.id+"  "+emp1.name);
    }
}

