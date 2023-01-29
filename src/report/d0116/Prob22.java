package report.d0116;

class CellPhone {
	///field
	private final String phoneNumber;
	private int totalCallTime;
	private int totalFee;
	private int feePerCallTime;
	///constructor
	
	public CellPhone(String phoneNumber, int feePerCallTime) {
		super();
		this.phoneNumber = phoneNumber;
		this.feePerCallTime = feePerCallTime;
	}
	///method
	public int getTotalCallTime() {
		return totalCallTime;
	}
	public void setTotalCallTime(int totalCallTime) {
		this.totalCallTime = totalCallTime;
	}
	public int getTotalFee() {
		return totalFee;
	}
	public void setTotalFee(int totalFee) {
		this.totalFee = totalFee;
	}
	public int getFeePerCallTime() {
		return feePerCallTime;
	}
	public void setFeePerCallTime(int feePerCallTime) {
		this.feePerCallTime = feePerCallTime;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void call(String phoneNum, int callTime) {
		this.totalCallTime += callTime;
		System.out.println(phoneNum + " 번호로 "+ callTime + " 통화함");
	}
	public void calculateTotalFee() {
		this.totalFee = this.totalCallTime * this.feePerCallTime;
	}
	public void printCallInform() {
		System.out.println(this.phoneNumber + "의 통화시간은 " + this.totalCallTime + "이며\n"+
							"단가 "+this.feePerCallTime + " 총 요금은 "+this.totalFee + "원 입니다.");
	}
}//end of CellPhone Class

class SmartPhone extends CellPhone{
	///field
	private boolean monthlyFixedRate;
	private int monthlyFixedFee;
	///constructor
	
	public SmartPhone(String phoneNumber, int feePerCallTime) {
		super(phoneNumber, feePerCallTime);
		
	}
	public SmartPhone(String phoneNumber, int feePerCallTime, boolean IsMonthlyFixedRate, int monthlyFixedFee ) {
		super(phoneNumber, feePerCallTime);
		this.monthlyFixedRate = IsMonthlyFixedRate;
		this.monthlyFixedFee = monthlyFixedFee;
	}
	/// method
	public void calculateTotalFee() {
		if (this.monthlyFixedRate == false) {
			super.calculateTotalFee();
		}else {
			System.out.println("고객님은 " + this.monthlyFixedFee +" 정액 요금제 입니다.");
			super.setTotalFee(monthlyFixedFee);
		}
	}
}//end of SmartPhone Class
public class Prob22 {
	 public static void main(String[] args) {
		 CellPhone cellPhone = new CellPhone("010-010-010", 1000);
		 cellPhone.call("017-017-017", 10);
		 cellPhone.call("016-016-016", 10);
		 cellPhone.calculateTotalFee();
		 cellPhone.printCallInform();
		 System.out.println("================================================");
		 SmartPhone smartPhone = new SmartPhone("000-000-000", 200);
		 smartPhone.call("017-017-017", 10);
		 smartPhone.calculateTotalFee();
		 smartPhone.printCallInform();
		 System.out.println("================================================");
		 SmartPhone smartPhone01 = new SmartPhone("111-111-111", 0, true, 3000);
		 smartPhone01.call("017-017-017", 10);
		 smartPhone01.call("016-016-016", 10);
		 smartPhone01.calculateTotalFee();
		 smartPhone01.printCallInform();
	 }
}
