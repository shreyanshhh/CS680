package edu.umb.cs680.hw13;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

@SuppressWarnings("deprecation")
public class StockQuoteObservable extends Observable{
	
	Map<String, Float> map = new HashMap<String, Float>();

	void changeQuote(String tick, float quote) {
		map.put(tick, quote);
		setChanged();
		notifyObservers(new StockEvent(tick, quote));
	}

	public static void main(String[] args) {
		System.out.println("StockQuoteObservable class has been Run");
	}
}
