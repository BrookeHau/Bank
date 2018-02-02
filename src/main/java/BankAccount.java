import java.util.Map.Entry;

public class BankAccount {

	private String accountNum;
	private String accountType;
	public double balance;
	private String pin = "2345";
	 

	public BankAccount(String accountNum, String accountType, double balance) {
		this.accountNum = accountNum;
		this.accountType = accountType;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNum;
	}

	public String getAccountType() {
		return accountType;
	}

	public double getAccountBalance() {
		return balance;
	}

	public void withdrawal(double withdrawalAmount) {
		balance -= withdrawalAmount;
		if(withdrawalAmount > balance){
			System.out.println("You overdrew your account, your new balance is: " + balance);
		}
	}

	public void deposit(double depositAmount) {
		balance += depositAmount;
	}

	public void computeCheckingBalWithInterest(double checkingInterest) {
		balance = (balance * (1 + checkingInterest));

	}

	public void savingInterest(double savingInterest) {
		balance = (balance * (1 + savingInterest));
	}

	public boolean allowAccess(String enteredPin) {
		return enteredPin.equals(pin);
	}

	public void showAccount() {
			System.out.println(accountNum + accountType + balance);
		}
	}

