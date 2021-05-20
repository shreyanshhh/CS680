package edu.umb.cs680.hw13;

import java.util.Observable;
import java.util.Observer;

public class PieChartObserver implements Observer{

	public void update(Observable obs, Object obj) {
		if (obj instanceof StockEvent) {
			StockEvent stockE = (StockEvent) obj;
			System.out.print("PieChart of StockEvent: " + stockE.getTicker() + " " + stockE.getQuote());
		} 
		
		else if (obj instanceof DJIAEvent) {
			DJIAEvent djiaEvent = (DJIAEvent) obj;
			System.out.print("PieChart of DJIAEvent: " + djiaEvent.getDJIA());
		}
	}
}
