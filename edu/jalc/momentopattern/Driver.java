package edu.jalc.momentopattern;

import edu.jalc.momentopattern.logging.Logger;
import edu.jalc.momentopattern.logging.State;

public class Driver {

	public static void main(String... args) throws Exception {

		System.setProperty("log root level", "INFO");
		Logger logger = new Logger();

		logger.message(State.DEBUG, "debugging").save();
		logger.message(State.INFO, "info").save();
		logger.message(State.WARN, "oh oh").save();
      logger.message(State.ERROR, "ERROR ERROR").save();
      try {
         Thread.sleep(500);
      }
      catch (Exception e){
      }
      logger.message(State.FATAL, "FATAL").save();

	}
}
