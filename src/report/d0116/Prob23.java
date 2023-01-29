package report.d0116;
import java.util.*;
class ArrayCopy{
	//high level coupling relation
	//유지 보수 어려움
	//인캡슐레이션에 의한 절차적 은닉이 되지 않음
	/*
	public Vector<String> moveToVector(String[] datas){
		Vector<String> v = new Vector<String>(10,10);
		for (int i = 0; i<datas.length; i++) {
			v.add(datas[(datas.length-i-1)]);
		}
		return v;
	}
	*/
	//low level coupling relation
	//유지 보수가 쉬움
	//인캡슐레이션에 의한 절차적 은닉 달성
	//how to : method signature의 return 타입을 interface나  superclass로 설정
	public List<String> moveToVector(String[] datas){
		List<String> v = new ArrayList<String>(10);
		for (int i = 0; i<datas.length; i++) {
			v.add(datas[(datas.length-i-1)]);
		}
		return v;
	}
}//EOC


public class Prob23 {
	public static void main(String[] args) {
		ArrayCopy ac=new ArrayCopy();
		String datas[]= {"1","2","3","4","5"};
		List<String> v = new Vector<String>();
		v = ac.moveToVector(datas);
		System.out.println(v);
	}//EOM
}//EOC
