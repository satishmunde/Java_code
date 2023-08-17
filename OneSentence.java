import java.util.*;
class OneSentence
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
String str;
char ch;
System.out.println("Enter a Sentence");
str=sc.nextLine();

System.out.println(" "+str);
ch=str.charAt(0);
System.out.println(" 1nd Character "+ch);

ch=str.charAt(1);
System.out.println(" 2nd Character "+ch);
ch=str.charAt(2);
System.out.println(" 3nd Character "+ch);
ch=str.charAt(3);
System.out.println(" 4nd Character "+ch);
ch=str.charAt(4);
System.out.println(" 5nd Character "+ch);

}
}