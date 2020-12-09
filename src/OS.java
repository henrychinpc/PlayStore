
public class OS {
	private String type; // OS type, e.g. Android or iOS
	private int version; // Version number of the OS

	public OS(String type, int version) {
		this.type = type;
		this.version = version;
	}

	public String getType() {
		return this.type;
	}

	public int getVersion() {
		return this.version;
	}
}
