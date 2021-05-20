package edu.umb.cs680.hw13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StockTest {

	PieChartObserver PiechartObserver = new PieChartObserver();
	TableObserver TableObs = new TableObserver();
	ThreeDObserver ThreeDObs = new ThreeDObserver();
	StockQuoteObservable stockObs = new StockQuoteObservable();

	@Test
	public void DJIAEquality() {
		stockObs.addObserver(PiechartObserver);
		stockObs.addObserver(TableObs);
		stockObs.addObserver(ThreeDObs);
		stockObs.changeQuote("abc",20);
		stockObs.changeQuote("pqr",15);
	}

}
