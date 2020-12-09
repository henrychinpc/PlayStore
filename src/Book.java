
public class Book extends Reading {
	private String[] author;

	public Book(String id, String name, double price, String publisher, String genre, int numPages, String[] author) {
		super(id, name, price, publisher, genre, numPages);
		this.author = new String[author.length];
		System.arraycopy(author, 0, this.author, 0, author.length); // Pass actual values instead of object reference
	}

	public Book(String id, String name, String publisher, String genre, int numPages, String[] author) {
		super(id, name, 0, publisher, genre, numPages); // Default price to 0 (free) when price is not passed as an
														// argument
		this.author = new String[author.length];
		System.arraycopy(author, 0, this.author, 0, author.length);
	}
}
