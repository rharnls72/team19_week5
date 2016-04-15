package phonerate;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class App {
	private static final Logger log = LoggerFactory.getLogger(App.class);
	private App(){
	}
	public static void main( String[] args ){
		
		TotalRate totalrate;
		log.info("Type : ");
		Scanner input = new Scanner(System.in);
		String type = input.nextLine();
		log.info("Line : ");
		int line = input.nextInt();
		log.info("Minutes : ");
		double minutes = input.nextDouble();

		User user = new User(type, line, minutes);
		totalrate = new TotalRate(user);
		log.info("Total : " + totalrate.totalrate());
	}
}
