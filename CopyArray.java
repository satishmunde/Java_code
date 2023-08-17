import java.util.*;
class CopyArray
{
public static void main(String[] args)
{
int[] arr1=new int[5];
int[] arr2=new int[5];
int n,a,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the elements ");
for(a=0;a<5;a++)
{
arr1[a]=sc.nextInt();
} 
for(n=0;n<5;n++)
{
arr2[n]=arr1[n];
}
System.out.println("after coping in another arry");
for(b=0;b<5;b++)
{
System.out.println(arr2[b]);
}

}
}