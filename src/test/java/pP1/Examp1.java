package pP1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Examp1 {
	
	private static Logger log =LogManager.getLogger(Examp1.class.getName());
	
	public static void main(String[] args){

				log.debug("I am debugging");
				log.info("object is not present");
				log.error("This is fatal");
		
}
}
