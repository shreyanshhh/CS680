package edu.umb.cs680.hw13;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StockEventTest {
private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@BeforeEach
	public void settingUp() {
		System.setOut(new PrintStream(outContent));
	}
	
	@Test
	public void StockTest() {
		StockQuoteObservable DJQO = new StockQuoteObservable();
		ThreeDObserver threeDObs = new ThreeDObserver();
		PieChartObserver pieObs = new PieChartObserver();
		TableObserver tableObs = new TableObserver();

		DJQO.addEvent(threeDObs);
		DJQO.addEvent(pieObs);
		DJQO.addEvent(tableObs);

		DJQO.notifyObservers(new StockEvent(DJQO));
		
		assertEquals("3D Chart for StockEvent quote value: Piechart for StockEvent quote value: Table for StockEvent quote value: ", outContent.toString());
	}
}
