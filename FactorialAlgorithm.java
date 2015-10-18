# Data-Structure
class FactorialAlgorithm
{
    public int naiveFactorial(int n)
    {
        int factorial = 1;
        while (n > 0)
        {
            factorial *= n--;
        }
        return factorial;
    }

    public int recursiveFactorial(int n)
    {
        if (n == 1 || n == 0)
        {
            return 1;
        }
        else
        {
            return n * this.recursiveFactorial(n - 1);
        }
    }
}
