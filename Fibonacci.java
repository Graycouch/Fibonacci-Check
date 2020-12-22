package project6;


public class Fibonacci 
{
    
    //this is the recursive solution to the Fibonacci series
    public static long recursiveFib(int n)
    {
        if(n<=2)
            return 1;
        else
            return recursiveFib(n-1) + recursiveFib(n-2);
    }
    
    
    //this is the iterative solution to the Fibonacci series
    public static long iterativeFib(int n) 
    {
        long returnValue;
        
        if(n<=2)
        {returnValue = 1;}
        else
        {
            long olderValue = 1;
            long oldValue = 1;
            long newValue = 1;
            
            for(int i = 3; i <= n ; i++)
            {
                newValue = olderValue + oldValue;
                olderValue = oldValue;
                oldValue = newValue;
            }
            returnValue = newValue;
        }
        return returnValue;
    }
    

    
}