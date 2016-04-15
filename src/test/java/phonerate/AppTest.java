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
}
