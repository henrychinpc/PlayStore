import java.util.ArrayList;

public abstract class Content {
	private String id; // Content ID
	private String name; // Content name
	private double price; // Content price
	private int numDownloads; // Number of downloads
	private ArrayList<Comment> review; // List of reviews for this content

	public Content(String id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.numDownloads = 0;
		this.review = new ArrayList<Comment>();
	}

	public void addReviews(Comment cmt) {
		this.review.add(cmt);
	}

	public String getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public double getPrice() {
		return this.price;
	}

	public int getNumDownloads() {
		return this.numDownloads;
	}

	public void incrementNumDownloads() {
		// A method to increment the number of downloads when called
		this.numDownloads++;
	}

	public void printAllReview() {
		if (this.review.size() == 0) {
			System.out.println("No review yet.");
			return;
		}

		System.out.println("The review(s) for " + this.name + " are:\n");

		for (int i = 0; i < this.review.size(); i++) {
			Comment rev = this.review.get(i);
			this.printReview(rev);
		}
	}

	private void printReview(Comment review) {
		review.printComment();
		review.printReplies();
	}
}
