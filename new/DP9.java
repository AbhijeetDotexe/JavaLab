class Account
{
	public int balance;
	public int accountNo;
	void displayBalance()
	{
		System.out.println("Account No : "+ accountNo + " , Balance : "+balance);
	}
	synchronized void deposit(int amount)
	{
		balance = balance + amount;
		System.out.println(amount+" is deposited");
		displayBalance();
	}
	synchronized void withdraw(int amount)
	{
		balance=balance-amount;
		System.out.println(amount+" is withdrawn");
		displayBalance();
	}
}

class TransactionDeposit implements Runnable
{
	int amount;
	Account accountX;
	TransactionDeposit(Account x,int amount)
	{
		accountX=x;
		this.amount=amount;
		new Thread(this).start();
	}
	public void run()
	{
		accountX.deposit(amount);
	}
}
class TransactionWithdraw implements Runnable
{
	int amount;
	Account accountY;
	TransactionWithdraw(Account y,int amount)
	{
		accountY=y;
		this.amount=amount;
		new Thread(this).start();
	}
	public void run()
	{
		accountY.withdraw(amount);
	}
}

public class DP9
{
	public static void main(String[] args)
	{
		Account abc=new Account();
		abc.balance=1000;
		abc.accountNo=111;
		TransactionDeposit t1;
		TransactionWithdraw t2;
		t1=new TransactionDeposit(abc,500);
		t2=new TransactionWithdraw(abc,900);
	}

}

