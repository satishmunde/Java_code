class CopyWithoutCons
{
    int id;
    String name;

    CopyWithoutCons(int i,String n)
    {
    id=i;
    name=n;
    }

 CopyWithoutCons()
 {

 }   
 void display()
 {
     System.out.println(id+""+name);
 }
 public static void main(String[] args)
 {
     CopyWithoutCons c=new CopyWithoutCons(11,"Satish");
     CopyWithoutCons c2=new CopyWithoutCons();
     c2.id=c.id;
     c2.name=c.name;
     c.display();
     c2.display();
 }
}