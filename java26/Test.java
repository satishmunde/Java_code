class Test
{
public static void main(String...args)
{
int[] arr={1,2,3,4,5};

System.out.println(arr[0]);
System.out.println(arr[1]);
System.out.println(arr[2]);
try
{
System.out.println(arr[6]);
}     
catch(Exception a1)
{
System.out.println(" Got the exception");
}
System.out.println(arr[3]);
System.out.println(arr[4]);
}
}