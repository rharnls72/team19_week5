package phonerate;

public class Plan {
	private double rateperadditionalminute;
	private int includedminutes;
	private double rateperadditionalline;
	private double planrate;
	private Gold gold;
	private Silver silver;
	public Plan(User user){
		if("gold".equals(user.type())){
			gold = new Gold();
			this.rateperadditionalminute = gold.rateperadditionalminute();
			this.includedminutes = gold.includedminutes();
			this.rateperadditionalline = gold.rateperadditionalline();
			this.planrate = gold.planrate();
		}
		if("silver".equals(user.type())){
			silver = new Silver();
			this.rateperadditionalminute = silver.rateperadditionalminute();
			this.includedminutes = silver.includedminutes();
			this.rateperadditionalline = silver.rateperadditionalline();
			this.planrate = silver.planrate();
		}
	}
	public double rateperadditionalminute() {
		return rateperadditionalminute; 
	}
	public int includedminutes() {
		return includedminutes; 
	}
	public double rateperadditionalline() {
		return rateperadditionalline;
	}
	public double planrate() {
		return planrate;
	}
}
