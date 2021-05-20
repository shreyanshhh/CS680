package edu.umb.cs680.hw11;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Car> cars = new ArrayList<>();
		cars.add(new Car("Rav 4","Toyota",2016,15000,5000));
		cars.add(new Car("Levante", "Maserati",2011,9000, 6000));
		cars.add(new Car("M5","BMW", 2012, 20000, 8000));
		cars.add(new Car("A4","Audi",2014,12000,5400));
		cars.add(new Car("E class","Mercedes Benz",2015,9000,6500));
		System.out.println("Before sorting");
		System.out.println("Name | Make | Year | Mileage | Price");
		for(Car c: cars){
			System.out.println(c.getModel()+" | "+c.getMake() +" | "+c.getYear()+" | "+c.getMileage()+" | "+c.getPrice());
		}
		
		System.out.println("Results after sorting");
		System.out.println("Name | Make | Year | Mileage | Price");
		Collections.sort(cars, new MileageComparator());
		for(Car c: cars){
			System.out.println(c.getModel()+" | "+c.getMake() +" | "+c.getYear()+" | "+c.getMileage()+" | "+c.getPrice());
		}
		
	}

}
