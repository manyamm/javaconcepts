package arrayas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

	public static int removeduplicateelements(int a[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				a[j++] = a[i];

			}
		}
		a[j++] = a[n - 1];
		return j;

	}
	
	public static void main(String args[]) {
		int a[] = {10,20,20,30,40,40,50,40,30,};
		System.out.println(a[8]);
		int length = a.length;
		length = removeduplicateelements(a,length);
		//printing array elements
		for(int i = 0; i < length; i++) {
			System.out.println(a[i]+"");
		}
		
		List<Integer> list = new ArrayList<Integer>();
		list = Arrays.asList(1,2,3,4,5,6);
		list.get(0);
	}
}


