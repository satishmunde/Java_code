 
 
abstract class Demo1{
abstract void show();
}
class Demo extends Demo1{

    void show(){
        System.out.println("This is abstract method in child class");
    }
    public static void main(String[] args) {
     Demo1 d= new Demo();
    
     d.show();
    }
}