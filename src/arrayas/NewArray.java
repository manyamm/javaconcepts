package arrayas;

public class NewArray {
public static void main(String[]args){

	int number[] = {5,3,2,8,9,5,7,5,2};
	
	int temp;
	
	boolean  fixed = false;
//	while(fixed ==  false) {
//		fixed = true;
	for(int j=0; j<number.length-1;j++) {
		for( int i = j+1; i<number.length; i++) {
			if(number[i] < number[j]) {
				temp = number[j];
				number[j] = number[i];
				number[i] = temp;
				fixed = false;
				
			}
			
		}
	}
	
	for( int i = 0; i<number.length; i++) {
		System.out.println(number[i]);
	}
	

	
}
}