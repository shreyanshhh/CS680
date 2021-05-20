package edu.umb.cs680.hw13;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.EventListener;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DJIAEventTest {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@BeforeEach
	public void settingUp() {
		System.setOut(new PrintStream(outContent));
	}
	
	@Test
	public void DJIATest() {
		DJIAQuoteObservable DJQO = new DJIAQuoteObservable();
		ThreeDObserver threeDObs = new ThreeDObserver();
		PieChartObserver pieObs = new PieChartObserver();
		TableObserver tableObs = new TableObserver();

		DJQO.addEventListner(threeDObs);
		DJQO.addEventListner(pieObs);
		DJQO.addEventListner(tableObs);

		DJQO.notifyObservers(new DJIAEvent(DJQO));
		
		assertEquals("3D Chart for DJIA quote value: Piechart for DJIA quote value: Table for DJIA quote value: ", outContent.toString());
	}
}


