class Teacher
{
    void assignment()
    {
        System.out.println("Complate the assignment before the 25 may");
    }
}
class Overriding extends Teacher
{
    void assignment()
    {
        System.out.println("We will complete the assignment after 25 may");
    }
    public static void main(String...args)
    {
        Overriding s1=new Overriding();
        s1.assignment();
    }

}