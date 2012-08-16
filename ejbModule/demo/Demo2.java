package demo;

import javax.ejb.Stateless;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * DemoService2.java
 *
 * Aug 15, 2012
 * @author Viktor Pekar
 */

/**
 * @author Viktor Pekar
 * 
 *         Aug 15, 2012
 */

@Stateless
public class Demo2 implements IDemo2 {
	private static final Logger logger = LoggerFactory
			.getLogger(Demo2.class);

	public void printOutHelloWorld2() {
		logger.info("###### SECOND TEST SUCESS ######");
	}

}
