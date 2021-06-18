public class ThueMorse
{
        public static void main (String[] args)
        {
                int n = Integer.parseInt(args[0]);
                int[][] matrix = new int[n][n];
                char[][] pm = new char[n][n];
                int[] arr = new int[n*n];
                int counter = 0; 
                arr[0] = 0; 

                int t = n; 
                while (t>=2)
                {
                        t/=2;
                        counter++;
                }

                for (int i = 0; i < (2*counter); i++)
                {
                    for (int j = 0; j < Math.pow(2, i); j++)
                    {
                            if (arr[j] == 0) arr[j + (int)Math.pow(2, i)] = 1;
                            else  arr[j + (int)Math.pow(2, i)] = 0; 
                    }
                }
                
                for (int i = 0; i < n; i++) 
                {
                        for (int j = 0; j < n; j++) 
                        {
                                matrix[i][j] = arr[j+i*n];
                                if (arr[i] == arr[j]) pm[i][j] = '+';
                                else pm[i][j] = '-';
                                System.out.print(pm[i][j] + " ");
                        }
                        System.out.println();
                }

        }
}

