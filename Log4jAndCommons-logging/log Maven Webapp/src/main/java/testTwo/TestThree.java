package testTwo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class TestThree {
	static Log log = LogFactory.getLog(TestThree.class);
	public static void main(String[] args) {
		

		log.debug("TestThree.debug");
		log.info("TestThree.info");
		log.warn("TestThree.warn");
		log.error("TestThree.error");
	}

}
