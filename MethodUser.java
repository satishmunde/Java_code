import java.util.*;
class MethodUser
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");;
        int num=sc.nextInt();
        findEvenOdd(num);
    }

    public static void findEvenOdd(int num)
    {
        if(num%2==0)
        {
            System.out.println("Your number is even");
        }
        else
        {
            System.out.println("your number is odd");
        }
    }
}