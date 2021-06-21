public class DiscreteDistribution
{
    public static void main(String[] args)
    {
        int  m = Integer.parseInt(args[0]);
        int[] n = new int[m];
        int length = args.length;
        int total = 0;

        // read in inputs and create an array for it 
        for (int i = 1; i < length; i++)
        {
            n[i] = Integer.parseInt(args[i]);
            total += n[i];
        }

        for (int j = 0; j < m; j++) 
        {
            int r = (int) (total*Math.random());
            int sum = 0, event = -1; 
            for (int i = 0; i < m && sum <= r; i++)
            {
                sum += n[i];
                event = i;
            }
            System.out.print(event + " ");

            if ((j + 1) >= 25 && (j + 1) % 25 == 0)  System.out.println();
        }   
        System.out.println();
    }
}



