package edu.umb.cs680.hw13;

import java.util.EventListener;

public interface DJIAQuoteObserver extends EventListener{

	void updateDJIA(DJIAEvent djiaEvent);
}
