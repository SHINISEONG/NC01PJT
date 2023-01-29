package kr.co.heeseong.practiceio;
import java.io.*;
public class WriteObjPepleVo {
	///field
	public WriteObjPepleVo() {
		// TODO Auto-generated constructor stub
	}
	
	///method
	public static void writeObj(String name, int age, int serialNo) throws IOException {
		ObjectOutputStream oos = null;
		oos = new ObjectOutputStream(new FileOutputStream("PeopleInfo.obj"));
		oos.writeObject(new PeopleVO(name, age, serialNo));
		oos.flush();
		oos.close();
	}

}
