package testOne;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class TestOne {
	private static Log log = LogFactory.getLog(TestOne.class);
	public static void main(String[] args) {
		log.debug("TestOne.debug");
		log.info("TestOne.info");
		log.warn("TestOne.warn");
		log.error("TestOne.error");
	}
}
