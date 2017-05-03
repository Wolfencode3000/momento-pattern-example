package edu.jalc.momentopattern.logging.observers;

import edu.jalc.momentopattern.logging.Message;
import edu.jalc.momentopattern.logging.State;
import edu.jalc.momentopattern.logging.messages.*;
import edu.jalc.momentopattern.logging.messages.Error;
import edu.jalc.momentopattern.logging.observers.utils.StateLookUpTable;

import java.util.HashMap;

public class ConsoleLogger implements Observer {

	private State rootLevel;

	public ConsoleLogger(){

		switch(System.getProperty("log root level")){
			case "DEBUG": rootLevel = State.DEBUG; break;
			case "TRACE": rootLevel = State.TRACE; break;
			case "WARN": rootLevel = State.WARN; break;
			case "ERROR": rootLevel = State.ERROR; break;
			case "FATAL": rootLevel = State.FATAL; break;
			case "INFO":
			default: rootLevel = State.INFO;
		}

	}
	public void observe(Message message) {
		State level = StateLookUpTable.values.get(message.getClass());
		if(level.ordinal() >= rootLevel.ordinal()){
			System.out.println(message);
		}
	}
}
