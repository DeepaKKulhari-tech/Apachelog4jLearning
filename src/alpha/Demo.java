package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {
//common step to logging in each class
	private static Logger log=LogManager.getLogger(Demo.class.getName());//LogManager is an API
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
  log.debug("I am debugging");
  if(3>4)
	  log.info("object is present");
 log.error("object is not present");
 log.fatal("this is fatal");
// https:logging.apache.org/log4j/2.x/manual/configuration.html

	}

}
