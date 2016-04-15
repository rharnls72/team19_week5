package phonerate;

public class Silver {
	private double silverrateperadditionalminute = 0.54;
	private int silverincludedminutes = 500;
	private double silverrateperadditionalline = 21.50;
	private double silverplanrate = 29.95;
	public double rateperadditionalminute() {
		return silverrateperadditionalminute;
	}
	public int includedminutes() {
		return silverincludedminutes;
	}
	public double rateperadditionalline() {
		return silverrateperadditionalline;
	}
	public double planrate() {
		return silverplanrate;
	}
}
