# Data-Structure
public class SumAlgorithm
{
    public static int naiveSum(int[] numbers)
    {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            sum += numbers[i];
        }
        return sum;
    }
    public static int recursiveSum(int[] numbers, int n)
    {
        if (n == 0)
        {
            return numbers[0];
        }
        else
        {
            return numbers[n] + recursiveSum(numbers, n - 1);
        }
    }
}
