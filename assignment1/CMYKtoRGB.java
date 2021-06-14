public class CMYKtoRGB
{
	public static void main(String[] args)
	{
		double c,m,y,k;
		c = Double.parseDouble(args[0]);
		m = Double.parseDouble(args[1]);
		y = Double.parseDouble(args[2]);
		k = Double.parseDouble(args[3]);

		double white, red, green, blue;

	       	white = 1 - k; 
		red = Math.round(255*white*(1-c));
		green = Math.round(255*white*(1-m));
		blue = Math.round(255*white*(1-y));

		System.out.println("red = " + (int)red);
		System.out.println("green = " + (int)green);
		System.out.println("blue = " + (int)blue);
	}

}
