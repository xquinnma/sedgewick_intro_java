public class Birthday 
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int[] countArr = new int[n];

        for (int i = 0; i < trials; i++)
        {
            boolean [] arr = new boolean[n];

            for (int j = 0; j < n; j++)
            {
                int day = (int) (Math.random() * n);
                if (arr[day]) 
                {
                    countArr[j]++;
                    break;
                } 
                arr[day] = true;
            }
        }

        double[] fraction = new double[n]; 

        for (int i = 0; i < n; i++)
        {
            int temp = 0; 
            for (int j = 0; j <= i; j++)
            {
                temp += countArr[j];
            }
            fraction[i] = ((double) temp/trials);
        }

        for (int i = 0; i < n; i++)
        {
            System.out.println((i + 1) +"\t" + countArr[i] + "\t" + fraction[i]);
            if (fraction[i] > 0.5) break; 
        }
    }
}
