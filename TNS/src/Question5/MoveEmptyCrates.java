package Question5;
import java.util.Arrays;

public class MoveEmptyCrates {

	public static void main(String[] args) {
		 int[] crates = {0, 1, 0, 3, 12, 0, 5, 0};
	        
	        moveEmptyCratesToEnd(crates);
	        
	        
	        System.out.println("Crates after moving empty ones to the end: " + Arrays.toString(crates));
	}

	    public static void moveEmptyCratesToEnd(int[] crates) {
	        int n = crates.length;
	        int nonEmptyIndex = 0; 

	        
	        for (int i = 0; i < n; i++) {
	            if (crates[i] != 0) {
	                crates[nonEmptyIndex] = crates[i];
	                nonEmptyIndex++;
	            }
	        }

	       
	        while (nonEmptyIndex < n) {
	            crates[nonEmptyIndex] = 0;
	            nonEmptyIndex++;
	        }
	    }
	}
		
	