package kr.co.heeseong;

class B implements Runnable {
	///field
	private int i =1 ;
	private int j =2 ;
	
	///runMethod
	public void run() {
		System.out.println(this.i + this.j);
	}
}



public class A {

	public A() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		B b = new B();
		Thread t = new Thread(b);
		t.start();
		
		
	}

}
