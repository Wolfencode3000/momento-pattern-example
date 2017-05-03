package edu.jalc.momentopattern.logging.observers.utils;

import edu.jalc.momentopattern.logging.State;
import edu.jalc.momentopattern.logging.messages.*;
import edu.jalc.momentopattern.logging.messages.Error;

import java.util.HashMap;

public class StateLookUpTable {
	public static final HashMap<Class, State> values = new HashMap<>();
	static {
		values.put(Debug.class, State.DEBUG);
		values.put(Trace.class, State.TRACE);
		values.put(Fatal.class, State.FATAL);
		values.put(Info.class, State.INFO);
		values.put(Warn.class, State.WARN);
		values.put(Error.class, State.ERROR);
	}
}
