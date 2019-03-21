package arrayas;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayList {

	public static void main(String[] args) {
		
		List<String> topCompanies = new ArrayList();
		
				
		System.out.println("Is top companies list empty:" + topCompanies.isEmpty());
		
	  topCompanies.add("Google");
	  topCompanies.add("Intel");
	  topCompanies.add("Amazon");
	  topCompanies.add("Flipcart");
	  topCompanies.add("CTM");
	  
	  //find the size of arrayList
	  System.out.println("Hereare the top companies: " + topCompanies.size() +" Companies in te world");
	  
	  //retrive element at a given index
	  
	  String bestCompany = topCompanies.get(0);
	  String newCompany = topCompanies.get(2);
	  
	  //modify element at given index
	  
	  topCompanies.set(1,"firstcompany");
	  System.out.println("Modified top companies list: " +topCompanies );
		
		
		
	}

}
