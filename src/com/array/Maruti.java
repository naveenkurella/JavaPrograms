package com.array;

public class Maruti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double price;
		Celerio celerio = new Celerio();
		String Model = celerio.getModel();
		
		String cartype= celerio.makeCar();
		
		if(Model.equals("Celerio")&&cartype.equals("2012Model")) {
			
			price=425000;
		}
		
	}

}
