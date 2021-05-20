package edu.umb.cs680.hw13;

public class PieChartObserver implements StockQuoteObserver, DJIAQuoteObserver{
	
	public PieChartObserver(){
		super();
	}
	
	
	@Override
	public void updateStock(StockEvent stockEvent) {
		System.out.print("Piechart for StockEvent quote value: ");
		
	}


	@Override
	public void updateDJIA(DJIAEvent bondEvent) {
		System.out.print("Piechart for DJIA quote value: ");

		
	}
}
