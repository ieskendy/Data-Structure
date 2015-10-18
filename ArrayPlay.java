# Data-Structure
class ArrayPlay extends ArrayCommon
{
    private double max;
    private double average;
    private double[] numbers;
    /**
    * Number of elements of the array numbers[]
    */
    private int n;
    public ArrayPlay(double[] numbers)
    {
        this.setNumbers(numbers);
    }
    public void setNumbers(double[] numbers)
    {
        this.numbers = numbers;
        this.n = numbers.length;
    }
    private double getMax()
    {
        this.max = this.numbers[0];
        for (int i = 1; i < this.n; i++)
        {
            if (this.numbers[i] > this.max)
            {
                this.max = this.numbers[i];
            }
        }
        return this.max;
    }
    private double getAverage()
    {
        double sum = 0;
        for (int i = 0; i < this.n; i++)
        {
            sum += this.numbers[i];
        }
        return sum / this.n;
    }
    private void duplicateArray()
    {
        double[] numbersCopy = new double[this.n];
        for (int i = 0; i < this.n; i++)
        {
            numbersCopy[i] = this.numbers[i];
        }
        this.printNumbers(numbers);
    }
    private void reverseArrangement()
    {
        for (int i = 0; i < this.n / 2; i++)
        {
            double temp = this.numbers[i];
            this.numbers[i] = this.numbers[this.n - 1 - i];
            this.numbers[this.n - i - 1] = temp;
        }
        this.printNumbers(this.numbers);
    }
    public static void main(String[] args)
    {
        double[] sample = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 0.0};
        ArrayPlay arr = new ArrayPlay(sample);
        IO.echo("Your Set of Numbers: ", false);
        arr.printNumbers(sample);
        IO.echo("\nLargest Numbers is " + arr.getMax(), true);
        IO.echo("Average of Numbers is " + arr.getAverage(), true);
        IO.echo("\nDuplicated the array", true);
        arr.duplicateArray();
        IO.echo("\n\nReverse the Arrangement", true);
        arr.reverseArrangement();
    }
}
