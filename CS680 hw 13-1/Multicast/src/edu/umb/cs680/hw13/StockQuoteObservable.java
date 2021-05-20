package edu.umb.cs680.hw13;

import java.util.EventListener;
import java.util.LinkedList;

public class StockQuoteObservable {
	
	public LinkedList<StockQuoteObserver> StockObs = new LinkedList<>();
	
	public void addEvent(EventListener eventListen) {
		StockObs.add((StockQuoteObserver) eventListen);
	}
	public void notifyObservers(StockEvent SE){
		for(int i=0;i<StockObs.size();i++){
			StockObs.get(i).updateStock(new StockEvent(SE));	
		}
	}
}
