import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestLog {

	private static Logger log=LogManager.getLogger(TestLog.class.getName());//LogManager is an API
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  log.debug("I am debugging");
  if(7>4)
	  log.info("object is present");
 log.error("object is not present");
 log.fatal("this is fatal");
// https:logging.apache.org/log4j/2.x/manual/configuration.html

	}

}
