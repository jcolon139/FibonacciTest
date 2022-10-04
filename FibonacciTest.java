/*Javier Colon Morales
 * 10-03-2022
 * CEN-3024C Software Development 1
 * Professor Mary Walauskis
 * 
 * Module 5 - Documentation Assignment*/

public class FibonacciTest {
	
	public static int recursiveFibonacci(int n) {

        if(n <= 1)
        {
            return 1;
        }
        else {
            return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
        }
    }
	
	public static int iterativeFibonacci(int n) {
        if(n <= 1)
        {
            return 1;
        }
        
        int i;
        int sum = 0;
        int previous = 1;
        int previousToPrevious = 1;
        
        for(i = 2; i <= n; i++){
        	
            sum = previous + previousToPrevious;
            previousToPrevious = previous;
            previous = sum;
        }
        return sum;
    }

	public static void main(String[] args) {
		
		int i;
		int numberOfLoops = 45;
		int iterativeStart;
		int recursiveStart;
        System.out.print("Loops    \tIterative Time(ms)     \tRecursive Time(ms)\n");
        System.out.print("-----   \t------------------   \t------------------\n");
        long startTime;
        long endTime;
        int difference,difference2;
        for(i = 1;i <= numberOfLoops;i++){
        	startTime  = System.nanoTime();
            iterativeStart = iterativeFibonacci(i);
            endTime  = System.nanoTime();
            difference  = (int)((endTime - startTime) / 1e6);
            startTime = System.nanoTime();
            recursiveStart = recursiveFibonacci(i);
            endTime = System.nanoTime();
            difference2 = (int)((endTime - startTime) / 1e6);
            System.out.print(i+"\t\t"+difference+"\t\t\t"+difference2 +"\t\n");
        }

	}

}