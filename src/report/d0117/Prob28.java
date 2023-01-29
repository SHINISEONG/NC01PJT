package report.d0117;

class UrlParsing {
	/// field
	/// constructor
	/// method
	public static String getParameter(String url, String paramName) {
		String result = "";
		String[] urlParsing = url.split("&");
		for (int i = 0; i < urlParsing.length; i++) {
			String[] parsingTmp = urlParsing[i].split("=");
			for (int j = 0; j < parsingTmp.length; j++) {
				
				if (parsingTmp[j].equals(paramName)) {
					result = parsingTmp[j+1];
				
					break;
				}
			}
		}
		return result;
	}
}

public class Prob28 {
	public static void main(String[] args) {
		String url1	= "http://localhost/order?prodId=PROD_001&prodName=������3&price=980000";
		String url2	= "http://localhost/registUser?userId=USER-001&userName=ȫ�浿&address=����� ������&userAge=26";
		System.out.println("��ǰ �̸� : " + UrlParsing.getParameter(url1, "prodName"));
		System.out.println("ȸ�� �ּ� : " + UrlParsing.getParameter(url2, "address"));
	}
}
