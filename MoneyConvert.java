import java.util.*;
class MoneyConvert
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int ch;
double ru,pa,da;
 

System.out.println(" \nPress 1 For Rupees conversion");
System.out.println(" \nPress 2 For Doller Conversion");
System.out.println(" \nEnter Your Choice");
ch=sc.nextInt();

if(ch==1)
{
	System.out.println(" Press 3 for Rupees to Paisa Conversion");
	System.out.println(" Press 4 for Paisa to Rupees Conversion");
	System.out.println(" Enter Your Choice");
	ch=sc.nextInt();
		

	if(ch==3)
		{
			System.out.println(" Enter Your Amount in Rupees");
			ru=sc.nextInt();
			pa=ru*100;
			System.out.println(" Your Given Rupees in Paisa \t"+pa);

		}
	
	else if(ch==4)
		{
			System.out.println(" Enter Your Amount in Paisa");
			pa=sc.nextInt();
			ru=pa/100;
			System.out.println(" Your Given Paisa in Rupees \t"+ru);

		}
	else
		{
			System.out.println(" Wrong Input");
		}
	}

else if(ch==2)
{
	System.out.println(" Press 5 for Rupees to Dollar Conversion");
	System.out.println(" Press 6 for Dollar to Rupees Conversion");
	System.out.println(" Enter Your Choice");
	ch=sc.nextInt();	

	if(ch==5)
		{
			System.out.println(" Enter Your Amount in Rupees");
			ru=sc.nextInt();
			da=ru/76;			

			System.out.println(" Your Rupees in Doller "+da);
		}

	else if(ch==6)
		{
			System.out.println(" Enter Your Amount in Dollar");
			da=sc.nextInt();
			ru=da*76;			

			System.out.println(" Your Doller in rupees "+ru);

		}
		
	else
		{
			System.out.println(" Wrong input");
		}

	}
else
	{
		System.out.println(" Wrong  input");
	}
}
}	