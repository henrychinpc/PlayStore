
public class Magazine extends Reading {
	private String titleMain; // Title of the main feature

	public Magazine(String id, String name, double price, String publisher, String genre, int numPages,
			String titleMain) {
		super(id, name, price, publisher, genre, numPages);
		this.titleMain = titleMain;
	}

	public Magazine(String id, String name, String publisher, String genre, int numPages, String titleMain) {
		super(id, name, 0, publisher, genre, numPages); // Default price to 0 (free) when price is not passed as an
														// argument
		this.titleMain = titleMain;
	}

	public String getTitleMain() {
		return this.titleMain;
	}
}
