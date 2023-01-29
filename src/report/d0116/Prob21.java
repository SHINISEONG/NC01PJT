package report.d0116;

class Book{
	///field
	private String title;
	private int price;
	///constructor
	public Book() {
		super();
		this.title = "";
		this.price = 0;
	}
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	///method
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
} // end of Book class

class BookMgr{
	Book bookArray[];

	public BookMgr(Book[] bookArray) {
		super();
		this.bookArray = bookArray;
	}
	
	public void printBooklist() {
		System.out.println("=== 책 목록 ===");
		for (int i = 0 ; i < bookArray.length; i++) {
			System.out.println(bookArray[i].getTitle());
		}
		System.out.println("");
	}
	
	public void printTotalPrice() {
		int total=0;
		for (int i = 0 ; i < bookArray.length; i++) {
			total+=bookArray[i].getPrice();
		}
		System.out.println("=== 책 가격의 총합 ===");
		System.out.println("전체 책 가격의 합 : "+total);
	}
	
	
}

public class Prob21 {
	public static void main(String[] args) {
		Book[] bookArray = new Book[5];
		bookArray[0] = new Book("Java Program", 25000);
		bookArray[1] = new Book("JSP Program", 15000);
		bookArray[2] = new Book("SQL Fundamental", 30000);
		bookArray[3] = new Book("JDBC Program", 28000);
		bookArray[4] = new Book("EJB Program", 34000);
		
		BookMgr bookMgr = new BookMgr(bookArray);
		bookMgr.printBooklist();
		bookMgr.printTotalPrice();
		
	}
}
