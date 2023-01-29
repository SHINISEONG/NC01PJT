package kr.co.heeseong.practiceio;

import java.io.IOException;

public class ReadObjPeopleTest {

	public ReadObjPeopleTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PeopleVO people = null;
		try {
			people = ReadObjPeopleVo.readObj();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(people);		
	}

}
