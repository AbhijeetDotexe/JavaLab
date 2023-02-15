import java.util.Scanner;
abstract class account
{
	abstract void createAccount();
	abstract void update(int acc, double a, char ch);
abstract void display();
}
class bankAccount extends account
{
	int acctNo;
	String name;
	double amt;
	String acctType;
	void createAccount()
	{
	    Scanner s = new Scanner(System.in);
		System.out.println("Enter the account type(saving / current) = ");
		acctType = s.nextLine();
		System.out.println("Enter the account number(...");
		acctNo=s.nextInt();
		s.nextLine();
		System.out.println("Enter your name ...");
		name=s.nextLine();
		System.out.println("Enter the amount with which you want to create the account(minimun = 1000rs )...");
		amt=s.nextDouble();	
		System.out.println("Account created...");
		
	}
    void update(int acc , double a , char ch)
	{
		
		if(acc== acctNo)
		{   
            if(ch=='d' || ch=='D' )
              amt += a;
            else if(ch=='w' || ch=='W' || ch=='t' || ch== 'T')
			{
				if(amt>=1000)
				{ amt -=a;
			       System.out.println("Amount updated...");
				}   
		        else
				  System.out.println("Insufficient balance...");
		    }
		   else System.out.println("Wrong input");
    	}
        else System.out.println("Account number does not exist...");
	}
	
	void display()
	{
		System.out.println("Account no. = "+ acctNo);
		System.out.println("Name = " + name );
		System.out.println("Balance = " + amt);
	}
}


class CP5
{   
	public static void main(String[] args)
	{   
	    Scanner s= new Scanner(System.in);
		bankAccount b= new bankAccount();
		int ch;
		do{
		System.out.println("1. To create an account.");
		System.out.println("2. To update money or transfer money");
		System.out.println("3. To display details of the account");
		 System.out.println("4.Exit");
	    System.out.println(" Enter your choice(1 -4 ) = ");
		ch=s.nextInt();
		if(ch==1)
		{
			b.createAccount();
		}
		else if(ch==2)
		{
			char code ;
			double amt;
			int account;
			System.out.println("Enter the account number = ");
			account  = s.nextInt();
			System.out.println("Enter amount = ");
		    amt=s.nextInt();
			System.out.println("Enter D/W/T (deposite /withdraw / tranfer)= ");
			code= s.next().charAt(0);
			b.update(account , amt , code);
	    }
		else if(ch==3)
		{
			b.display();
		}
		else if(ch==4) System.out.println("Terminating");
		else if(ch!=4) System.out.println("Wrong choice...");
		}while(ch!=4);
		
	
	   
	}
}
