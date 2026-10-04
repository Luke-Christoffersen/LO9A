
public class BankAccount {
	private double _balance;
	
	BankAccount(double balance) {
		this._balance = balance;
	}
	
	void withdraw(double withdraw) throws NegativeBalanceException {
		if (withdraw > _balance) {
			throw new NegativeBalanceException(_balance-withdraw);
		}
		_balance -= withdraw;
	}
	
	void quickWithdraw(double withdraw) throws NegativeBalanceException {
		if (withdraw > _balance) {
			throw new NegativeBalanceException();
		}
		_balance -= withdraw;
	}
	
}
