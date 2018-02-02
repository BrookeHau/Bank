import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.text.NumberFormat;

public class Bank {
	
	private double checkingInterest = 0.01;
	private double savingInterest = 0.02;

	private Map<String, BankAccount> accounts = new HashMap<String, BankAccount>();

	public void addBankAccount(String accountNum, BankAccount newAccount) {
		accounts.put(accountNum, newAccount);

	}

	public int Banksize() {
		return accounts.size();
	}

	public void removeAccount(String removeAccount) {
		accounts.remove(removeAccount);
	}

	public void showAccounts() {
		for (Entry<String, BankAccount> entry : accounts.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue().getAccountType() + " "
					+ entry.getValue().getAccountBalance());
		}

	}

	public BankAccount getBankAccountNum(String depositAccount) {
		return accounts.get(depositAccount);
	}

	public void depositInSpecificAccount(String accountNum, double amount) {
		accounts.get(accountNum).deposit(amount);
	}

	public void withdrawalInSpecificAccount(String accountNum, double amount) {
		accounts.get(accountNum).withdrawal(amount);
	}

	// public void addInterestToAccounts(){
	// accounts.
	// }

	public void addInterestToAccounts() {
		for (Entry<String, BankAccount> entry : accounts.entrySet()) {
			entry.getValue().computeCheckingBalWithInterest(checkingInterest);
		}

	}
}
