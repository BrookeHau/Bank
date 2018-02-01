import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.text.NumberFormat;

public class Bank {

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
	
	public void showAccounts(){
		for(Entry<String, BankAccount> entry: accounts.entrySet()){
		System.out.println(entry.getKey() + " " + entry.getValue().getAccountType() + " " + entry.getValue().getAccountBalance());
		}
	
}

	public BankAccount getBankAccountNum(String depositAccount) {
		return accounts.get(depositAccount);
	}
}
