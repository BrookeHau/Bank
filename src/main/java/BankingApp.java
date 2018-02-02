import java.util.Scanner;

public class BankingApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Bank myAccounts = new Bank();

		myAccounts.addBankAccount("1234", new BankAccount("1234", "Checking", 500.00));
		myAccounts.addBankAccount("2345", new BankAccount("2345", "Savings", 3250.00));
		myAccounts.addBankAccount("6789", new BankAccount("6789", "Checking", 33.00));

		System.out.println("Welcome to the WCCI Bank. Here are your accounts: ");
		myAccounts.showAccounts();
		System.out.println();
		String optionEntered = " ";

		 for(int i = 0; i <365; i++){
		do {
			System.out.println("What would you like to do?");
			System.out.println("Press 1 to deposit");
			System.out.println("Press 2 to withdrawal");
			System.out.println("Press 3 to check balance");
			System.out.println("Press 4 to close an account");
			System.out.println("Press -1 to exit");
			optionEntered = input.nextLine();

			if (optionEntered.equals("1")) {
				System.out.println("Select the account you would like to deposit to");
				String depositAccount = input.nextLine();
				System.out.println("How much would you like to deposit?");
				double depositAmount = input.nextDouble();
				myAccounts.depositInSpecificAccount(depositAccount, depositAmount);
				System.out.println(myAccounts.getBankAccountNum(depositAccount).getAccountBalance());

			}
			if (optionEntered.equals("2")) {
				System.out.println("Select the account you'd like to withdrawal from");
				String withdrawalAccount = input.nextLine();
				System.out.println("How much would you like to withdrawal?");
				double withdrawalAmount = input.nextDouble();
				myAccounts.withdrawalInSpecificAccount(withdrawalAccount, withdrawalAmount);
				// System.out.println(myAccounts.getBankAccountNum(withdrawalAccount).getAccountBalance());

			}
			if (optionEntered.equals("3")) {
				System.out.println("Which account balance would you like to see?");
				String checkBalAccount = input.nextLine();
				System.out.println(
						"Your account balance is " + myAccounts.getBankAccountNum(checkBalAccount).getAccountBalance());
			}
			if (optionEntered.equals("4")) {
				System.out.println("Which account would you like to close?");
				String closeAccount = input.nextLine();
				System.out.println("You are closing account: " + closeAccount);
				myAccounts.removeAccount(closeAccount);
			}
			if (optionEntered.equals("-1")) {
				System.out.println("Thank you for visiting.  Have a nice day!");
				System.exit(0);
			}
			System.out.println("Here is a summary of your accounts: ");
			myAccounts.showAccounts();
			myAccounts.addInterestToAccounts();

		} while (!(optionEntered.equals("-1")));

		 } 
	}
}
