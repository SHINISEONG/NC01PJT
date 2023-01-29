package report.d0113;

class PrimeUtil {
	/// field
	/// constructor
	/// method
	public static int countPrime(int limit) {
		if (limit <2)
		{
			return 0;
		}
		if (limit==2)
		{
			return 1;
		}
		
		int cnt = 1;
		for (int i = 3; i<limit+1; i++)
		{
			if (i%2 != 0)
			{
				for (int j=3; j<=i ; j++ )
				{
					if (i%j == 0)
					{
						if (i != j)
						{
							break;
						} else {
							cnt++;
						}
					} //end of measure if
				} //end of inner for
			} // end of Even If
		} // end of outer for
		return cnt;
	}// end of method

	public static int[] savePrime(int limit) {
		int[] save=new int[PrimeUtil.countPrime(limit)];
		
		if (limit==2)
		{
			save[0]=2;
			return save;
		}
		save[0]=2;
		int cnt = 1;
		for (int i = 3; i<limit+1; i++)
		{
			if (i%2 != 0)
			{
				for (int j=3; j<=i ; j++ )
				{
					if (i%j == 0)
					{
						if (i != j)
						{
							break;
						} else {
							save[cnt]=i;
							cnt++;
						}
					} //end of measure if
				} //end of inner for
			} // end of Even If
		} // end of outer for
		return save;
	}// end of method

	
	public static void printPrime(int n) {
		if (n<2) {
			System.out.println("0���� ���� ���� �Է��� �Ұ��� �ϸ�, 1������ �Ҽ��� �����ϴ�.");
			System.exit(0);
		}
		System.out.println("1~"+n+"������ �Ҽ��� ������ "+PrimeUtil.countPrime(n)+"EA �̸� �Ҽ��� �Ʒ��� ����.");
		int [] savePrime = PrimeUtil.savePrime(n);
		System.out.println("/////////////////////////////////////////////////////////////");
		for(int i = 0 ; i < savePrime.length; i++) {
			System.out.print(savePrime[i]+((i==savePrime.length-1)?"":", "));
		}
	}

}

public class Prob18 {
	/// main
	public static void main(String[] args) {
		PrimeUtil.printPrime(67);
	}

}
 