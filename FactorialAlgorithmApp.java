# Data-Structure
class FactorialAlgorithmApp
{
    public static void main(String[] args)
    {
        int n;
        FactorialAlgorithm factorial = new FactorialAlgorithm();
        n = IO.readInt ("Please Enter Number: ");
        IO.echo("NaiveFactorial " + n + "!" + " = " + factorial.naiveFactorial(n), true);
        IO.echo("RecursiveFactorial " + n + "!" + " = " + factorial.recursiveFactorial(n), true);

    }
}
