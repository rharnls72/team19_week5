package phonerate;

public class TotalRate {
	private User user;
	private Plan plan;
	private double excessminuterate;
	private double familyrate;
	private double additionallinerate;
	private double planrate;
	private double phonerate;

	public TotalRate(User user) {
		this.user = user;
		plan = new Plan(user);
		calculaterate();
	}
	private void calculaterate() {
		phonerate = excessminuterate() + additionallinerate() + familyrate() + planrate();
	}
	public double totalrate() {
		return phonerate;
	}
	public double excessminuterate() {
		if(user.minutesofuse() > plan.includedminutes()) {
			double temp = user.minutesofuse()-(double)plan.includedminutes();
			this.excessminuterate= temp*plan.rateperadditionalminute();
		}else{
			this.excessminuterate= 0;
		}
		return excessminuterate;
	}
	public double additionallinerate() {
		if (user.numberofline()==0){
			additionallinerate = 0;
		}else if (user.numberofline()<4){
			additionallinerate = plan.rateperadditionalline()*(user.numberofline()-1);
		}else{
			additionallinerate = plan.rateperadditionalline()*2;
		}
		return additionallinerate;
	}
	public double familyrate() {
		if (user.numberofline()>3){ 
			familyrate = (user.numberofline() - 3)*5;
		}else {
			familyrate = 0;
		}
		return familyrate;
	}
	public double planrate() {
		if (user.numberofline()==0){
			planrate = 0;
		}else{
			planrate = plan.planrate();
		}
		return planrate;
	}
}
