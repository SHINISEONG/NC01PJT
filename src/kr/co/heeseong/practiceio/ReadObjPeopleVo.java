package kr.co.heeseong.practiceio;

import java.io.*;
public class ReadObjPeopleVo {

	public ReadObjPeopleVo() {
		// TODO Auto-generated constructor stub
	}
	///method
	public static PeopleVO readObj() throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("PeopleInfo.obj"));
		PeopleVO people = (PeopleVO)ois.readObject();
		ois.close();
		return people;
	}
}
