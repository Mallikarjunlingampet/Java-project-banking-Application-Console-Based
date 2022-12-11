package BankingProject;

public class BankAccount {
	private String name;
	private String acctype;
	private String age;
	private int balance;
	private String Accno;
	public BankAccount(String name, String acctype, String age, int balance,String Accno) {
		super();
		this.name = name;
		this.acctype = acctype;
		this.age = age;
		this.balance = balance;
		this.Accno=Accno;
	}
	public String getName() {
		return name;
	}
	public String getAcctype() {
		return acctype;
	}
	public String getAge() {
		return age;
	}
	public int getBalance() {
		return balance;
	}
	public String getAccno() {
		return Accno;
	}
	
	
	
	

}
