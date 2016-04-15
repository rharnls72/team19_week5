package phonerate;

public class User {
	private String type;
	private int numberofline;
	private double minutesofuse;
	
	public User(String type, int numberofline, double minutesofuse) {
		this.type = type;
		this.numberofline = numberofline;
		this.minutesofuse = minutesofuse;
	}
	
	public String type() {
		return type;
	}
	
	public int numberofline() {
		return numberofline;
	}
	
	public double minutesofuse() {
		return minutesofuse;
	}
}
