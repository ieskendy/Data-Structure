# Data-Structure
public class GCDAlgorithm
{
    public int euclidGCD(int x, int y)
    {
        IO.echo("(" + x + ", " + y + ")", true);
        if (y == 0) return x;
        else return this.euclidGCD(y, x % y);
    }
}
