//importing Scanner
import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please choose an option: \n1. Sequence found without recursion. \n2. Sequence found using recursion.");
	    int choice = input.nextInt();
	    
	    switch(choice) {
	    
		case 1:
				// non-recursive method 
				// four variables will act as placeholders as
				// the array is traversed 
				int i = 0; 
				// j, k represent placeholders moving along the array
				// where they are the values preceeding the current 
				// fibonacci value
				// 0 and 1 are the first two values of the fibonacci sequence by desinition
				long j = 1;
				long k = 0;
				// fib is the printed fibonacci value
				long fib = 0;
				
				System.out.println("How many values of the Fibonacci sequence would you like?");
				long Num =  input.nextLong();
				
				for(i = 0; i < Num; i++) {
					System.out.println(fib);
					fib = j + k;
					j = k;
					k = fib;
				}

				break;
	    
	    case 2:
		    	System.out.println("How many values of the Fibonacci sequence would you like?");
				long length =  input.nextLong();
				
				input.close();
	    			    		
	    		for(i = 0; i < length; i++) {
	    			System.out.println(fibonacciRecursive(i));
	    		}
	    		break;
			
	    default: 
			System.out.println("Invalid choice, try again, 1 or 2!");
				    		    	
	    }//end switch statement
	    	
    }//end method
	    
	public static long fibonacciRecursive(long N){

		if(N <= 1)
			return N;
		else
			return fibonacciRecursive(N-1) + fibonacciRecursive(N-2);      
	}//end method
	        
}//end class

