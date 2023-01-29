package report.d0117;

class UrlEncoding {
	/// field
	/// constructor
	/// method
	public static String toEncoding(String str) {
		String tmp = "";
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 0 && str.charAt(i) <= 127) {
				result += str.charAt(i);
			} else {
				byte[] temp = str.substring(i, (i + 1)).getBytes();
				for (int j = 0; j < temp.length; j++) {
					tmp += Integer.toHexString(temp[j]);

					result = result + "%" + tmp.substring(6, 8).toUpperCase();
					tmp = "";
				}

			}
		}
		return result;
	}
}

public class Prob27 {
	public static void main(String[] args) {
		System.out.println("입력 : Korea");
		System.out.println("출력 : " + UrlEncoding.toEncoding("Korea"));
		System.out.println("입력 : 홍길동");
		System.out.println("출력 : " + UrlEncoding.toEncoding("홍길동"));
		System.out.println("입력 : 홍 길 동");
		System.out.println("출력 : " + UrlEncoding.toEncoding("홍 길 동"));
		System.out.println("입력 : Hong 길 동");
		System.out.println("출력 : " + UrlEncoding.toEncoding("Hong 길 동"));
		System.out.println("입력 : 0319");
		System.out.println("출력 : " + UrlEncoding.toEncoding("0319"));

	}
}
