package report.d0118;

class Account {
	/// field
	private final String accountNo;
	private boolean creditLine;
	private int creditLineLimit;
	private int balance;

	/// constructor
	public Account(String accountNo) {
		super();
		this.accountNo = accountNo;		
	}
	public Account(String accountNo, boolean creditLine, int creditLineLimit, int balance) {
		super();
		this.accountNo = accountNo;
		this.creditLine = creditLine;
		this.creditLineLimit = creditLineLimit;
		this.balance = balance;
	}

	/// get/set method
	public boolean isCreditLine() {
		return creditLine;
	}

	public void setCreditLine(boolean creditLine) {
		this.creditLine = creditLine;
	}

	public int getCreditLineLimit() {
		return creditLineLimit;
	}

	public void setCreditLineLimit(int creditLineLimit) {
		this.creditLineLimit = creditLineLimit;
	}

	public int getBalance() {
		return balance;
	}

	
	public String getAccountNo() {
		return accountNo;
	}

	/// method
	public void deposit(int money) {
		this.balance += money;
	}

	public void withdraw(int money) throws Exception {
		if (balance < money) {
			if (this.creditLine == true) {
				if ((money-balance) < creditLineLimit) {
					this.balance -= money;
					
				} else {
					throw new Exception("잔고부족 출금불가 합니다.");
				}
			} else {
				throw new Exception("잔고부족 출금불가 합니다.");
			}
		} else {
			this.balance -= money;
		}
	}

	@Override
	public String toString() {
		if (this.creditLine == true) {
		return "계좌번호 : " + accountNo + ", 잔고 : " + balance + "\t[[ -" + creditLineLimit + "원 마이너스 통장 ]]";
		}
		return "계좌번호 : " + accountNo + ", 잔고 : " + balance;
	}

} // end of Account Class

public class Prob31 {
	public static void main(String[] args) {
		Account account01 = new Account("111-111-111", true, 1000000, 100000);
		try {
			System.out.println("0. 최초 계좌 상태");
			System.out.println("[계좌정보] " + account01);

			System.out.println("\n1. " + account01.getAccountNo() + "계좌 200000 출금요청");
			account01.withdraw(200000);
			System.out.println("[계좌정보] " + account01);
			
			System.out.println("\n2. " + account01.getAccountNo() + "계좌 100000 입금요청");
			account01.deposit(100000);
			System.out.println("[계좌정보] " + account01);
			
			System.out.println("\n3. " + account01.getAccountNo() + "계좌 500000 출금요청");
			account01.withdraw(500000);
			System.out.println("[계좌정보] " + account01);
			
			System.out.println("\n4. " + account01.getAccountNo() + "계좌 600000 출금요청");
			account01.withdraw(600000);
			System.out.println("[계좌정보] " + account01);
		} catch (Exception e) {
			System.out.println(">>>예외발생 : " + account01.getAccountNo() + " : " + e.getMessage());
		}
		
		Account account02 = new Account("222-222-222");
			System.out.println();
		try {
			System.out.println("0. 최초 계좌 상태");
			System.out.println("[계좌정보] " + account02);

			System.out.println("\n1. " + account02.getAccountNo() + "계좌 100000 입금요청");
			account02.deposit(100000);
			System.out.println("[계좌정보] " + account02);
			
			System.out.println("\n2. " + account02.getAccountNo() + "계좌 50000 출금요청");
			account02.withdraw(50000);
			System.out.println("[계좌정보] " + account02);
			
			System.out.println("\n3. " + account02.getAccountNo() + "계좌 60000 출금요청");
			account02.withdraw(60000);
			System.out.println("[계좌정보] " + account02);
		} catch (Exception e) {
			System.out.println(">>>예외발생 : " + account01.getAccountNo() + " : " + e.getMessage());
		}
	}
}
