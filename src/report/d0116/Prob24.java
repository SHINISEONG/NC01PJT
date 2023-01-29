package report.d0116;

import java.util.Objects;

class CellPhoneTwo {
	//field
	private final String model;
	private double battery;
	//constructor
	public CellPhoneTwo(String model) {
		super();
		this.model = model;
	}
	//method
	public void charge(int time) throws IllegalArgumentException {
		if (time<0) {
			throw new IllegalArgumentException("통화시간 입력 오류");
		}
		battery += (time*3);
		if (battery > 100) {
			battery = 100;
		}
		System.out.println("충전 시간 : "+time+" 분");
	}
	public void call(int time) throws IllegalArgumentException	{
		
		if (time<0) {
			throw new IllegalArgumentException("통화시간 입력 오류");
		}
		battery -= (time*(0.5));
		if (battery<0) {
			battery =0 ;
		} 
		System.out.println("통화 시간 : "+time+" 분");
	}
	public void printBattery() {
		System.out.println("남은 배터리 양 : "+battery);
	}
	@Override
	public int hashCode() {
		return Objects.hash(model);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof CellPhoneTwo)) {
			System.out.println("핸드폰과 비교해주세요.");
			return false;
		}
		CellPhoneTwo other = (CellPhoneTwo) obj;
		return Objects.equals(model, other.model);
	}
	
}


public class Prob24 {

	public static void main(String[] args) {
		CellPhoneTwo myPhone = new CellPhoneTwo("SCH-600");
		
		myPhone.charge(20);
		myPhone.printBattery();
		myPhone.call(300);
		myPhone.printBattery();
		
		myPhone.charge(50);
		myPhone.printBattery();
		myPhone.call(40);
		myPhone.printBattery();
		
		try {
			myPhone.charge(-20);
			
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		String yourPhone = new String("SCH-600");
		if(myPhone.equals(yourPhone)) {
			System.out.println("동일모델입니다.");
		} else {
			System.out.println("다른모델입니다.");
		}
	}
}
