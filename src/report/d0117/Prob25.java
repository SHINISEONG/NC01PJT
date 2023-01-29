package report.d0117;

class LeftPad{
	///field
	///constructor
	///method
	public static String leftPad(String str, int n, char format) {
		String result="";
		for (int i = 0; i<(n-(str.length()));i++) {
			result += format;
		}
		result += str;
		return result;
	}
	
}

public class Prob25 {
	public static void main(String[] args) {
		System.out.println(LeftPad.leftPad("ABC",6,'#'));
		System.out.println(LeftPad.leftPad("ABC",5,'$'));
		System.out.println(LeftPad.leftPad("ABC",2,'&'));
	}

}
