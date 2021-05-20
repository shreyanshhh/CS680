package edu.umb.cs680.hw13;

public class ThreeDObserver implements StockQuoteObserver, DJIAQuoteObserver{
	
	public ThreeDObserver(){
		super();
	}
	
	@Override
	public void updateStock(StockEvent stockEvent) {
		System.out.print("3D Chart for StockEvent quote value: ");
		
	}

	@Override
	public void updateDJIA(DJIAEvent bondEvent) {
		System.out.print("3D Chart for DJIA quote value: ");

		
	}

	
	
}
