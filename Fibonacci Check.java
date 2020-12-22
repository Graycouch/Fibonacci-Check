package project6;

public class Project6 
{


    public static void main(String[] args) 
    {
        
        // this outputs the table with all the values
        System.out.printf("%-10s%-15s%-15s%-10s\n", "x", "fib(x)", "Recursive(ns)", "Iterative(ns)");
        System.out.println("======================================================");
        
        for(int x = 10 ; x <= 50 ; x+= 10)
        {
            System.out.printf("%-10d%-15d%-15d%-10d\n" , x , Fibonacci.iterativeFib(x) , findTimeRecursive(x) , findTimeIterative(x));
        }
	
        System.out.println("======================================================");
        
    }
    
    // this finds the time it takes for the recursive solution
    private static long findTimeRecursive(int x)
    {
        long start = System.nanoTime();
        Fibonacci.recursiveFib(x);
        long elapsed = System.nanoTime() - start;
        
        return elapsed;
    }
    
    // this finds the time it takes for the iterative solution.
    private static long findTimeIterative(int x)
    {
        long start = System.nanoTime();
        Fibonacci.iterativeFib(x);
        long elapsed = System.nanoTime() - start;
        
        return elapsed;
    }
    
}
