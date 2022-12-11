package BankingProject;

public class Customerinfo {
	private String branch;
	private BankAccount acctype;
	public Customerinfo(String branch, BankAccount acctype) {
		super();
		this.branch = branch;
		this.acctype = acctype;
	}
	public String getBranch() {
		return branch;
	}
	public BankAccount getAcctype() {
		return acctype;
	}
	
	public void display()
	{
		System.out.println("=================Customer details==================");
		System.out.println("name of the customer  " + acctype.getName());
		System.out.println("Age of the customer   " + acctype.getAge());
		System.out.println("Accountname of customer"+ acctype.getAcctype());
		System.out.println("Balance in the account "+ acctype.getBalance());
		System.out.println("==========Bank details====================");
		System.out.println("Branch of the bank     "+ branch);
		
	}
	
	
	
	

}
