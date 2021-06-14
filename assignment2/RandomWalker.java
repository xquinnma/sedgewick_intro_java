public class RandomWalker
{
  public static void main(String[] args)
  {
    int r = Integer.parseInt(args[0]);
    int  x = 0, y = 0;
    int steps = 0;

    System.out.println("(" + x + ", " + y + ")");

    while (Math.abs(x)+Math.abs(y) < r)
    {
      double dice = Math.random();
      if (dice < 0.25) x++;
      else if (dice < 0.5) y--;
      else if (dice < 0.75) x--;
      else y++;
      steps++;
      System.out.println("(" + x + ", " + y + ")");
    }
    System.out.println("steps = " + steps);

  }   
}

