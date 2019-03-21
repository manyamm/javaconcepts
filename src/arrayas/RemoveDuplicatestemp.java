package arrayas;

public class RemoveDuplicatestemp {
			
		public static int removeduplicateelements(int arr[],int k) {
			if(k == 0 || k == 1) {
				return k;
			}
			int[] temp = new int[k];
			int j = 0;
			for(int i = 0; i <k-1; i++ ) {
				
				if(arr[i] != arr[i+1]) {
					temp[j++] = arr[i+1];
					
				}
				
			}
			temp[j++] = arr[k-1];
			return j;
			
		}
		
		public static void main(String args[]) {
			int arr[] = {1,2,3,4,4,5,5,6,6,7,7};
			int length = arr.length;
			length = removeduplicateelements( arr,length);
			//printing array elements
			for(int i= 0; i< length; i++) {
				System.out.println(arr[i]+"");
			}
			
		}
	}


