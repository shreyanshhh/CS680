package edu.umb.cs680.hw13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DJIATest {
	
		PieChartObserver PiechartObserver = new PieChartObserver();
		TableObserver TableObs = new TableObserver();
		ThreeDObserver ThreeDObs = new ThreeDObserver();
		DJIAQuoteObservable djiaObs = new DJIAQuoteObservable();
	
	@Test
	public void DJIAEquality() {
		djiaObs.addObserver(PiechartObserver);
		djiaObs.addObserver(TableObs);
		djiaObs.addObserver(ThreeDObs);
		djiaObs.changeQuote(20);
		djiaObs.changeQuote(15);
	}
}
