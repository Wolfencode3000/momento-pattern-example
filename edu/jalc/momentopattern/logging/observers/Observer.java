package edu.jalc.momentopattern.logging.observers;

import edu.jalc.momentopattern.logging.Message;

public interface Observer {
	public void observe(Message message);
}
