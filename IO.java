# Data-Structure
import java.util.Scanner;
class IO
{
    /**
    * A wrapper method for the System.out.print() and println()
    * @param String str
    * @param boolean isNewLine
    */
    public static void echo(String str, boolean isNewLine)
    {
        if (isNewLine == true)
        {
            System.out.println(str);
        }
        else
        {
            System.out.print(str);
        }
    }
    /**
    * A helper function which specifically reads string inputs
    * @param String str
    */
    public static String readString(String str)
    {
        IO.echo(str, false);
        Scanner sc = new Scanner(System.in);
        String data = sc.next();
        return data;
    }
    /**
    * A helper function which specifically reads integer inputs
    * @param String str
    */
    public static int readInt(String str)
    {
        IO.echo(str, false);
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        return data;
    }
}
