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
		System.out.println("�Է� : Korea");
		System.out.println("��� : " + UrlEncoding.toEncoding("Korea"));
		System.out.println("�Է� : ȫ�浿");
		System.out.println("��� : " + UrlEncoding.toEncoding("ȫ�浿"));
		System.out.println("�Է� : ȫ �� ��");
		System.out.println("��� : " + UrlEncoding.toEncoding("ȫ �� ��"));
		System.out.println("�Է� : Hong �� ��");
		System.out.println("��� : " + UrlEncoding.toEncoding("Hong �� ��"));
		System.out.println("�Է� : 0319");
		System.out.println("��� : " + UrlEncoding.toEncoding("0319"));

	}
}
