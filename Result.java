package BankingProject;

public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba= new BankAccount("Sai", "Savings", "20", 1000, "1234");
		
		
		Customerinfo ci= new Customerinfo("kmr", ba);
		ci.display();
		
		UserInput ui= new UserInput("Sai", "1234",ba);
		if(ba.getAccno()==ui.accno)
		{
			ui.validate();
		}
		
		

	}

}
