# Data-Structure
public class FibonacciApp
{
    public static void main(String[] args)
    {
        FibonacciAlgorithm fibonacci = new FibonacciAlgorithm();
        int n;
        n = IO.readInt ("Please Enter Number: ");
        IO.echo("Fibonacci Number of " + fibonacci.naiveFibonacci(n), true);
        IO.echo("Fibonacci Number of " + fibonacci.recursiveFibonacci(n), true);

    }
}

