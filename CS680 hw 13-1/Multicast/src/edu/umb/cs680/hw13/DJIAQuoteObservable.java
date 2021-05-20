package edu.umb.cs680.hw13;

import java.util.ArrayList;
import java.util.EventListener;

public class DJIAQuoteObservable {
	
ArrayList<DJIAQuoteObserver> DJIAObs = new ArrayList<>();
	
	public void addEventListner(EventListener el){
		DJIAObs.add((DJIAQuoteObserver) el);
	}
	public void notifyObservers(DJIAEvent dj){
		for(int i=0;i<DJIAObs.size();i++){
			DJIAObs.get(i).updateDJIA(new DJIAEvent(dj));	
		}
	}

}