package testTwo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class TestTwo {
	static Log log = LogFactory.getLog(TestTwo.class);
	public static void main(String[] args) {
		
	
		log.debug("TestTwo.debug");
		log.info("TestTwo.info");
		log.warn("TestTwo.warn");
		log.error("TestTwo.error");
	}

}
