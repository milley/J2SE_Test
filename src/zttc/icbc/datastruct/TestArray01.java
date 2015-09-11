package zttc.icbc.datastruct;

public class TestArray01 {

	public static void main(String[] args) {
		Book[] books = new Book[5];
		books[0] = new Book("a");
		books[1] = new Book("b");
		books[2] = new Book("c");
		books[3] = new Book("d");
		books[4] = new Book("e");
		
		Book[] books1 = {new Book("a"), new Book("b"), new Book("c"), new Book("d"),
			new Book("e")};
		
		Person person = new Person("John", books);
		person.read(4);
		
		Person person1 = new Person("John", books1);
		person1.read(2);
	}

}

class Person {
	String name;
	Book[] books;
	public Person(String name, Book[] books) {
		super();
		this.name = name;
		this.books = books;
	}
	
	public void read(int num) {
		System.out.println(this.name + "ÕýÔÚ¶Á" + books[num]);
	}
}

class Book {
	String name;

	public Book(String name) {
		super();
		this.name = name;
	}
	
	public String toString() {
		return this.name;
	}
}