public class Minesweeper
{
    public static void main(String[] args)
    {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        char[][] board = new char[m][n];

        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                board[i][j] = '0';
            }
        }

        int counter = 0; 
        while (counter < k)
        {

            int x = (int) (Math.random() * m);
            int y = (int) (Math.random() * n);
            // System.out.println("Generated at point" + board[x][y]);
            // System.out.println(board[x][y] != '*');
            if (board[x][y] != '*')
            {
                board[x][y] = '*'; 
                counter++; 
            }
        }

        for (int x = 0; x < m; x++)
        {

            for (int y = 0; y < n; y++) {

                if (board[x][y] == '*')
                {
                    if (((x - 1) >= 0) && board[x - 1][y] != '*') board[x-1][y] = (char) ((int) board[x - 1][y] + 1);
                    if (((x - 1) >= 0 && (y + 1) < n && board[x - 1][y + 1] != '*')) board[x - 1][y + 1] = (char) ((int) board[x - 1][y + 1] + 1); 
                    if (((y + 1) < n && board[x][y + 1] != '*')) board[x][y + 1] = (char) ((int) board[x][y + 1] + 1);
                    if (((x + 1) < m && (y + 1) < n && board[x + 1][y + 1] != '*')) board[x + 1][y + 1] = (char) ((int) board[x + 1][y + 1] + 1);
                    if (((x + 1) < m && board[x + 1][y] != '*')) board[x + 1][y] = (char) ((int) board[x + 1][y] + 1);
                    if (((x + 1) < m && (y - 1) >= 0 && board[x + 1][y - 1] != '*')) board[x + 1][y - 1] = (char) ((int) board[x + 1][y - 1] + 1);
                    if (((y - 1) >= 0 && board[x][y - 1] != '*')) board[x][y - 1] = (char) ((int) board[x][y - 1] + 1);
                    if (((x - 1) >= 0  && (y - 1) >= 0 && board[x - 1][y - 1] != '*'))board[x - 1][y - 1] = (char) ((int) board[x - 1][y - 1] + 1);

                }

            }
        }

        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
