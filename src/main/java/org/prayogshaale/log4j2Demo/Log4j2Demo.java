package org.prayogshaale.log4j2Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 
 */

/**
 * @author pradyot.ha
 */
public class Log4j2Demo
{

	private static final Logger LOGGER = LogManager.getLogger(Log4j2Demo.class);

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		LOGGER.trace("Trace 1 Level");
		LOGGER.debug("Debug 2 Level");
		LOGGER.info("Info 3 Level");
		LOGGER.warn("Warn 4 Level");
		LOGGER.error("Error 5 Level");
		LOGGER.fatal("Fatal 6 Level");

	}

}
