// inner class
class Bank
{
String ifsc="159";
String name="MGB";
class Account
{
String accountno="12345678";
String custname="Satish Munde";
float balance=250000f;
void show()
{
System.out.println(" IFSC CODE "+ifsc);
System.out.println(" BANK NAME "+name);
System.out.println(" Account number "+accountno);
System.out.println(" Costomer name "+custname);
System.out.println(" Balance "+balance);
}
}
public static void main(String...args)
{
Bank.Account b1=new Bank().new Account();
b1.show();
}
}
