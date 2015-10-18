# Data-Structure
public class SumAlgorithmApp
{
    public static void main(String[] args)
    {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        IO.echo("NaiveSum = "
                + SumAlgorithm.naiveSum(numbers), true);
        IO.echo("RecursiveSum = "
                + SumAlgorithm.recursiveSum(numbers, numbers.length - 1), true);
    }
}
