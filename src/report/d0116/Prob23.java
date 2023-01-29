package report.d0116;
import java.util.*;
class ArrayCopy{
	//high level coupling relation
	//���� ���� �����
	//��ĸ�����̼ǿ� ���� ������ ������ ���� ����
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
	//���� ������ ����
	//��ĸ�����̼ǿ� ���� ������ ���� �޼�
	//how to : method signature�� return Ÿ���� interface��  superclass�� ����
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
