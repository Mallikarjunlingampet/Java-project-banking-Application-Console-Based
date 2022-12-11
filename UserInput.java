package BankingProject;

import java.util.Scanner;

public class UserInput {
	Scanner s= new Scanner(System.in);
	
	String name;
	String accno;
	
	int deposit,withdraw;
	int option;
	private BankAccount acctype;
	int amount;
	UserInput(String name,String accno,BankAccount acctype)
	{
		this.name=name;
		this.accno=accno;
		this.acctype=acctype;
	}
	
	
	public void validate()
	{
		
			System.out.println("Please choose below options");
			System.out.println("1.deposit\n 2.withdraw");
			option=s.nextInt();
			if(option==1)
			{
				deposit();
			}
			if(option==2)
			{
				withdraw();
			}
				
			
		
	}
	public void deposit()
	{
		System.out.println("please enter amount to deposit");
		deposit=s.nextInt();
		amount=amount+deposit+acctype.getBalance();
		System.out.println("Deposit successfull, Available balance is " + amount);
		
	}
	public void withdraw()
	{
		System.out.println("please enter amount to withdraw");
		withdraw=s.nextInt();
		if(withdraw<=amount) {
			amount=amount-withdraw;
			System.out.println("Available balance : " + amount);
		}
		else {
			System.out.println("insufficient balance");
		}
		
	}

}
