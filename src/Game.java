
public class Game extends Content {
	private boolean isMultiPlayer;
	private OS osReq; // OS requirement

	public Game(String id, String name, double price, boolean isMultiPlayer, OS osReq) {
		super(id, name, price);
		this.isMultiPlayer = isMultiPlayer;
		this.osReq = osReq;
	}

	public Game(String id, String name, boolean isMultiPlayer, OS osReq) {
		super(id, name, 0); // Default price to 0 (free) when price is not passed as an argument
		this.isMultiPlayer = isMultiPlayer;
		this.osReq = osReq;
	}

	public boolean getIsMultiPlayer() {
		return this.isMultiPlayer;
	}

	public OS getOsReq() {
		return this.osReq;
	}
}
