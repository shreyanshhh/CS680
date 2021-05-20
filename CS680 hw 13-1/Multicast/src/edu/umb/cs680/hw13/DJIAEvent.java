package edu.umb.cs680.hw13;

import java.util.EventObject;

public class DJIAEvent extends EventObject {
	float quote;

	public DJIAEvent(Object source) {
		super(source);
	}

}
