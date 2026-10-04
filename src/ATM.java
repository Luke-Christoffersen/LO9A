
public class ATM {
	private BankAccount _account;

	ATM() {
		_account = new BankAccount(500);
	}

	private void handleTransactions() {
		try {
			_account.withdraw(600);
		} catch (NegativeBalanceException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		
		try {
			_account.quickWithdraw(600);
		} catch (NegativeBalanceException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		ATM atm = new ATM();
		atm.handleTransactions();
	}
}
