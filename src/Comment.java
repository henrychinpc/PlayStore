import java.util.ArrayList;

public class Comment {
	private User user; // User who wrote the comment
	private String comment; // The actual comment
	private ArrayList<Comment> reply; // The replies to the comment

	public Comment(User user, String comment) {
		this.user = user;
		this.comment = comment;
		this.reply = new ArrayList<Comment>();
	}

	public void addReply(Comment cmt) {
		this.reply.add(cmt);
	}

	public void printComment() {
		// Format and print the comment
		String userName = this.user.getName();
		String userID = this.user.getId();
		System.out.println(userName + " (" + userID + "): " + this.comment);
	}

	// Two overloading printReplies methods
	public void printReplies() {
		/*
		 * When there is no argument passed in, the default indentation size is 1 tab,
		 * and each reply to the current reply will have increased indentation. However,
		 * the same level comments will have the same indentation, i.e., if two comments
		 * both replying the same comment, the two replies will indent the same.
		 */
		int replySize = this.reply.size();

		// Check if this comment has any reply.
		if (replySize > 0) {
			int numIndentation = 1; // Default indentation size.

			// Iterate through all the replies and print them all with the same indentation,
			// as they are on the same level.
			for (int i = 0; i < replySize; i++) {
				// Create first level indentation
				for (int j = 0; j < numIndentation; j++) {
					System.out.print("\t");
				}

				Comment rep = this.reply.get(i);
				rep.printComment();
				/*
				 * Recursively print any replies to the reply but increase the size of the
				 * indentation as these replies are on a lower level
				 */
				rep.printReplies(numIndentation + 1);
			}
		}
	}

	public void printReplies(int numIndentation) {
		/*
		 * This is the overloaded printReplies method where an argument must be passed.
		 * The argument indicates the number of tabs for initial indentation.
		 */
		int replySize = this.reply.size();

		if (replySize > 0) {
			for (int i = 0; i < replySize; i++) {
				for (int j = 0; j < numIndentation; j++) {
					System.out.print("\t");
				}

				Comment rep = this.reply.get(i);
				rep.printComment();
				rep.printReplies(numIndentation + 1);
			}
		}
	}

	public User getUser() {
		return this.user;
	}

	public String getComment() {
		return this.comment;
	}

	public ArrayList<Comment> getReply() {
		return this.reply;
	}
}
