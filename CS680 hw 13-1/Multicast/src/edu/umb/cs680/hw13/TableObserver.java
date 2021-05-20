package edu.umb.cs680.hw13;

public class TableObserver implements StockQuoteObserver, DJIAQuoteObserver{
	
	public TableObserver(){
		super();
	}
	
	@Override
	public void updateStock(StockEvent stockEvent) {
		System.out.print("Table for StockEvent quote value: ");
		
		}

	@Override
	public void updateDJIA(DJIAEvent bondEvent) {
		System.out.print("Table for DJIA quote value: ");
		
		}

}
