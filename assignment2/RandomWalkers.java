public class RandomWalkers
{
  public static void main(String[] args)
  {
    int r = Integer.parseInt(args[0]);
    double trials = Integer.parseInt(args[1]);
    double steps = 0;


    for (int i = 0; i < trials; i++)
    {
      int  x = 0, y = 0;
      while (Math.abs(x)+Math.abs(y) < r)
      {
        double dice = Math.random();
        if (dice < 0.25) x++;
        else if (dice < 0.5) y--;
        else if (dice < 0.75) x--;
        else y++;
        steps++;
      }
    }
    System.out.println("average number of steps = " + steps/trials);  
  }   
}

