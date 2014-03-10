package pattern_pratice;

public class BubbleSort implements iSort{

	@Override
	public int[] doSort(int[] values) {
		System.out.println("BubbleSort");
		
		int n = values.length;
	    int temp = 0;

	    for (int i = 0; i < n; i++) {
	        for (int j = 1; j < (n - i); j++) {

	            if (values[j - 1] > values[j]) {
	                temp = values[j - 1];
	                values[j - 1] = values[j];
	                values[j] = temp;
	            }

	        }
	    }
	    
		return values; 
	}
}
