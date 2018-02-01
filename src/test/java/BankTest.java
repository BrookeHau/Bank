import org.junit.Assert;
import org.junit.Test;

public class BankTest {

	@Test
	public void shouldCreateABankAccount() {
		BankAccount underTest = new BankAccount(null, null, 0);
		Assert.assertNotNull(underTest);
	}

	@Test
	public void shouldReturnAccountNumber() {
		BankAccount underTest = new BankAccount("12342", "Checking Account", 400.00);
		String check = underTest.getAccountNumber();
		Assert.assertEquals("12342", check);
	}

	@Test
	public void shouldReturnAccountType() {
		BankAccount underTest = new BankAccount("12342", "Checking Account", 400.00);
		String check = underTest.getAccountType();
		Assert.assertEquals("Checking Account", check);
	}

	@Test
	public void shouldReturnBalance() {
		BankAccount underTest = new BankAccount("12342", "Checking Account", 400.00);
		double check = underTest.getAccountBalance();
		Assert.assertEquals(400.00, check, 0.01);
	}

	@Test
	public void shouldWithdrawal15() {
		BankAccount underTest = new BankAccount("12342", "Checking Account", 400.00);
		underTest.withdrawal(15);
		double check = underTest.getAccountBalance();
		Assert.assertEquals(385.00, check, 0.01);
	}

	@Test
	public void shouldDeposit15() {
		BankAccount underTest = new BankAccount("12342", "Checking Account", 400.00);
		underTest.deposit(15);
		double check = underTest.getAccountBalance();
		Assert.assertEquals(415.00, check, 0.01);
	}

	@Test
	public void shouldAddCheckingInterest() {
		BankAccount underTest = new BankAccount("12342", "Checking Account", 400.00);
		underTest.checkingInterest(.01);
		double check = underTest.getAccountBalance();
		Assert.assertEquals(404.00, check, 0.01);
	}

	@Test
	public void shouldAddSavingInterest() {
		BankAccount underTest = new BankAccount("12342", "Checking Account", 400.00);
		underTest.savingInterest(.02);
		double check = underTest.getAccountBalance();
		Assert.assertEquals(408.00, check, 0.01);
	}

	@Test
	public void shouldAllowAccess() {
		BankAccount underTest = new BankAccount("12342", "Checking Account", 400.00);
		boolean check = underTest.allowAccess("2345");
		Assert.assertTrue(check);
	}

	@Test
	public void shouldDenyAccess() {
		BankAccount underTest = new BankAccount("12342", "Checking Account", 400.00);
		boolean check = underTest.allowAccess("2378");
		Assert.assertFalse(check);
	}

	@Test
	public void shouldCreateABank() {
		Bank underTest = new Bank();
		Assert.assertNotNull(underTest);
	}

	@Test
	public void shouldReturnBankSize() {
		Bank underTest = new Bank();
		underTest.addBankAccount("1234", new BankAccount("1111", "Checking", 250.00));
		int check = underTest.Banksize();
		Assert.assertEquals(1, check);
	}

	@Test
	public void shouldAddAccount() {
		Bank underTest = new Bank();
		underTest.addBankAccount("1234", new BankAccount("1111", "Checking", 250.00));
		underTest.addBankAccount("1356", new BankAccount("1111", "Checking", 250.00));
		int check = underTest.Banksize();
		Assert.assertEquals(2, check);
	}

	@Test
	public void shouldRemoveAccount(){
		Bank underTest = new Bank();
		underTest.addBankAccount("1234", new BankAccount("1111", "Checking", 250.00));
		 underTest.addBankAccount("1356", new BankAccount("1111", "Checking", 250.00));
		underTest.removeAccount("1356");
		int check = underTest.Banksize();
		Assert.assertEquals(1, check);
	}
}
