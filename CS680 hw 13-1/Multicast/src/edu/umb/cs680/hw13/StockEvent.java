package edu.umb.cs680.hw13;

import java.util.EventObject;

public class StockEvent extends EventObject{
	String ticker;
	float quote;
	
	public StockEvent(Object source) {
		super(source);	
	}
	
	@Override
	public Object getSource() {
		return quote;
	}

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public float getQuote() {
		return quote;
	}

	public void setQuote(float quote) {
		this.quote = quote;
	}
}
