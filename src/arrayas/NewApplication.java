package arrayas;

import java.util.ArrayList;

public class NewApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("Lion");
		animals.add("Dog");
		animals.add("cat");
		animals.add("bird");
		
		/*for(int i =0; i < animals.size(); i++) {
			
			System.out.println(animals.get(i));
		} */
		
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		Vehicle Vehicle2 = new Vehicle("Toyoto","Camery",1200,false);
		vehicles.add(Vehicle2);
		vehicles.add(new Vehicle("jeep","wrangler",25000,true));
		
		for(int i = 0; i<2; i++) {
			System.out.println(Vehicle2);
		}
		

	}

}
