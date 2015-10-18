# Data-Structure
class FibonacciAlgorithm extends ArrayCommon
{
    public int naiveFibonacci (int n)
    {
        double [] numbers = new double [n];
        numbers [0] = 0;
        numbers [1] = 1;
        for (int i = 2; i < n; i++)
        {
            numbers[i] = numbers [i - 1] + numbers [i - 2];
        }
        this.printNumbers(numbers);
        return n;
    }

    public int recursiveFibonacci (int n)
    {
        if (n == 1 || n == 0)
        {
            return 0;
        }
        else
        {
            return recursiveFibonacci (n - 1) + (n - 2);
        }
    }
}
