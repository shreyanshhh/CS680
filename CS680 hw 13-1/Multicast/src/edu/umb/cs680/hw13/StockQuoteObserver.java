package edu.umb.cs680.hw13;

import java.util.EventListener;

public interface StockQuoteObserver extends EventListener{

	void updateStock(StockEvent stockEvent);

}
