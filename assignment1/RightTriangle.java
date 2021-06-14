public class RightTriangle 
{
	public static void main (String[] args)
	{
		int n0 = Integer.parseInt(args[0]);
		int n1 = Integer.parseInt(args[1]);
		int n2 = Integer.parseInt(args[2]);
		
		int side1 = Math.min(n0, Math.min(n1, n2));
		int side3 = Math.max(n0, Math.max(n1, n2));
		int side2 = n0 + n1 +n2 - side1 - side3;
	
		boolean result = ((side1>0 && side2>0 && side3>0) && (side1*side1 + side2*side2 == side3*side3));
		System.out.println(result);

	}
}
