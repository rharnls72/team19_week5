package phonerate;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase{
	TotalRate total;
	User user;
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public AppTest( String testName ){
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()	{
		return new TestSuite( AppTest.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()	{
		App app = new App();
		assertTrue( true );
	}
	public void testGoldNoLine(){
		user=new User("gold", 0, 0);
		total=new TotalRate(user);
		assertEquals(0.0,total.totalrate(),10);
		assertEquals(0.0,total.planrate(),10);
		assertEquals(0.0,total.excessminuterate(),10); 
		assertEquals(0.0,total.additionallinerate(),10);
		assertEquals(0.0,total.familyrate(),10);
	}
	public void testSilverNoLine(){
		user=new User("silver", 0, 0);
		total=new TotalRate(user);
		assertEquals(0.0,total.totalrate(),10);
		assertEquals(0.0,total.planrate(),10);
		assertEquals(0.0,total.excessminuterate(),10); 
		assertEquals(0.0,total.additionallinerate(),10);
		assertEquals(0.0,total.familyrate(),10);
	}
	public void testGoldLineOne(){
        	user=new User("gold", 1, 900);
		total=new TotalRate(user);
        	assertEquals(49.95,total.totalrate(),10);
        	assertEquals(49.95,total.planrate(),10);
        	assertEquals(0.0,total.excessminuterate(),10); 
        	assertEquals(0.0,total.additionallinerate(),10);
        	assertEquals(0.0,total.familyrate(),10);
     	}
     	public void testSilverLineOne() {
        	user = new User("silver", 1, 300);
        	total = new TotalRate(user);
        	assertEquals(29.95, total.totalrate(),10);
        	assertEquals(29.95,total.planrate(),10);
        	assertEquals(0.0,total.excessminuterate(),10); 
		assertEquals(0.0,total.additionallinerate(),10);
        	assertEquals(0.0,total.familyrate(),10);
     	}
     	public void testGoldAdditionalLineOne() {
		user = new User("gold", 2, 500);
		total = new TotalRate(user);
		assertEquals(64.45, total.totalrate(),10);
		assertEquals(49.95,total.planrate(),10);
		assertEquals(0.0,total.excessminuterate(),10); 
		assertEquals(14.5,total.additionallinerate(),10);
		assertEquals(0.0,total.familyrate(),10);
	}
	public void testSilverAdditionalLineOne() {
		user = new User("silver", 2, 300);
		total = new TotalRate(user);
		assertEquals(51.45, total.totalrate(),10);
		assertEquals(29.95,total.planrate(),10);
		assertEquals(0.0,total.excessminuterate(),10); 
		assertEquals(21.5,total.additionallinerate(),10);
		assertEquals(0.0,total.familyrate(),10);
	}
	
	public void testGoldAdditionalLineTwo() {
		user = new User("gold", 3, 500);
		total = new TotalRate(user);
		assertEquals(78.95, total.totalrate(),10);
		assertEquals(49.95,total.planrate(),10);
		assertEquals(0.0,total.excessminuterate(),10); 
		assertEquals(29.0,total.additionallinerate(),10);
		assertEquals(0.0,total.familyrate(),10);
	}
	public void testSilverAdditionalLineTwo() {
		user = new User("silver", 3, 300);
		total = new TotalRate(user);
		assertEquals(72.95, total.totalrate(),10);
		assertEquals(29.95,total.planrate(),10);
		assertEquals(0.0,total.excessminuterate(),10); 
		assertEquals(43.0,total.additionallinerate(),10);
		assertEquals(0.0,total.familyrate(),10);
	}
	public void testGoldFamily1(){
		user=new User("gold", 4, 878);
		total=new TotalRate(user);
		assertEquals(83.95,total.totalrate(),10);
		assertEquals(49.95,total.planrate(),10);
		assertEquals(0.0,total.excessminuterate(),10); 
		assertEquals(29.0,total.additionallinerate(),10);
		assertEquals(5.0,total.familyrate(),10);
	}
	public void testGoldFamily2(){
		user=new User("gold", 5, 878);
		total=new TotalRate(user);
		assertEquals(88.95,total.totalrate(),10);
		assertEquals(49.95,total.planrate(),10);
		assertEquals(0.0,total.excessminuterate(),10); 
		assertEquals(29.0,total.additionallinerate(),10);
		assertEquals(10.0,total.familyrate(),10);
	}
	public void testSilverFamily1() {
		user = new User("silver", 4, 400);
		total = new TotalRate(user);
		assertEquals(77.95, total.totalrate(),10);
		assertEquals(29.95,total.planrate(),10);
		assertEquals(0.0,total.excessminuterate(),10); 
		assertEquals(43.0,total.additionallinerate(),10);
		assertEquals(5.0,total.familyrate(),10);
	}
	public void testSilverFamily2() {
		user = new User("silver", 5, 400);
		total = new TotalRate(user);
		assertEquals(82.95, total.totalrate(),10);
		assertEquals(29.95,total.planrate(),10);
		assertEquals(0.0,total.excessminuterate(),10); 
		assertEquals(43.0,total.additionallinerate(),10);
		assertEquals(10.0,total.familyrate(),10);
	}
	public void testGoldExcessMinutes(){
		user=new User("gold", 1, 1123);
		total=new TotalRate(user);
		assertEquals(105.3,total.totalrate(),10);
		assertEquals(49.95,total.planrate(),10);
		assertEquals(55.35,total.excessminuterate(),10); 
		assertEquals(0.0,total.additionallinerate(),10);
		assertEquals(0.0,total.familyrate(),10);
	}
	public void testSilverExcessMinutes(){
		user=new User("silver", 1, 700);
		total=new TotalRate(user);
		assertEquals(137.95,total.totalrate(),10);
		assertEquals(29.95,total.planrate(),10);
		assertEquals(108.0,total.excessminuterate(),10); 
		assertEquals(0.0,total.additionallinerate(),10);
		assertEquals(0.0,total.familyrate(),10);
	}
	
	public void testGoldAdditionalLineOneExcessMinutes(){
      		user=new User("gold", 2, 1123);
      		total=new TotalRate(user);
		assertEquals(119.8,total.totalrate(),10);
		assertEquals(49.95,total.planrate(),10);
      		assertEquals(55.35,total.excessminuterate(),10); 
      		assertEquals(14.5,total.additionallinerate(),10);
      		assertEquals(0.0,total.familyrate(),10);
   	}
   	public void testSilverAdditionalLineOneExcessMinutes() {
      		user = new User("silver", 2, 523);
		total = new TotalRate(user);
      		assertEquals(63.87, total.totalrate(),10);
      		assertEquals(29.95,total.planrate(),10);
      		assertEquals(12.42,total.excessminuterate(),10); 
      		assertEquals(21.5,total.additionallinerate(),10);
      		assertEquals(0.0,total.familyrate(),10);
   	}	

   	public void testGoldAdditionalLineTwoExcessMinutes(){
      		user=new User("gold", 3, 1123);
      		total=new TotalRate(user);
      		assertEquals(134.3,total.totalrate(),10);
      		assertEquals(49.95,total.planrate(),10);
      		assertEquals(55.35,total.excessminuterate(),10); 
      		assertEquals(29.0,total.additionallinerate(),10);
      		assertEquals(0.0,total.familyrate(),10);
   	}
   	
   	public void testSilverAdditionalLineTwoExcessMinutes() {
      		user = new User("silver", 3, 523);
      		total = new TotalRate(user);
      		assertEquals(85.37, total.totalrate(),10);
      		assertEquals(29.95,total.planrate(),10);
      		assertEquals(12.42,total.excessminuterate(),10); 
      		assertEquals(43.0,total.additionallinerate(),10);
      		assertEquals(0.0,total.familyrate(),10);
   	}

   	public void testGoldFamily1ExcessMinutes(){
      		user=new User("gold", 4, 1500);
      		total=new TotalRate(user);
      		assertEquals(308.95,total.totalrate(),10);
      		assertEquals(49.95,total.planrate(),10);
      		assertEquals(225.0,total.excessminuterate(),10);
      		assertEquals(29.0,total.additionallinerate(),10);
      		assertEquals(5.0,total.familyrate(),10);
   	}
   
   	public void testGoldFamily2ExcessMinutes(){
      		user=new User("gold", 5, 1500);
      		total=new TotalRate(user);
      		assertEquals(313.95,total.totalrate(),10);
      		assertEquals(49.95,total.planrate(),10);
      		assertEquals(225.0,total.excessminuterate(),10);
      		assertEquals(29.0,total.additionallinerate(),10);
      		assertEquals(10.0,total.familyrate(),10);
	}
	
   	public void testSilverFamily1ExcessMinutes(){
      		user=new User("silver", 4, 1500);
      		total=new TotalRate(user);
	 	assertEquals(617.95,total.totalrate(),10);
      		assertEquals(29.95,total.planrate(),10);
      		assertEquals(540.0,total.excessminuterate(),10);
      		assertEquals(43.0,total.additionallinerate(),10);
      		assertEquals(5.0,total.familyrate(),10);
   	}
   
   	public void testSilverFamily2ExcessMinutes(){
      		user=new User("silver", 5, 1500);
      		total=new TotalRate(user);
      		assertEquals(622.95,total.totalrate(),10);
      		assertEquals(29.95,total.planrate(),10);
      		assertEquals(540.0,total.excessminuterate(),10);
      		assertEquals(43.0,total.additionallinerate(),10);
      		assertEquals(10.0,total.familyrate(),10);
   	}
}
