class ArgumentsPrinter
{
    public static void main(String[] args)
    {
        int i = 0;
        if (args.length > 0)
        {
            while (i < args.length)
            {
                IO.echo(args[i++], true);
            }
        }
    }
}
