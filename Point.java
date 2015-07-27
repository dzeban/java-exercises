/**
 * Immutable point object.
 *
 * Once it initialized in constructor it will never change it coordinates - 
 * only create new objects.
 */
class Point {
	private final double x, y;

	Point() 
	{
		this.x = 0.0;
		this.y = 0.0;
	}

	Point(double x, double y) 
	{
		this.x = x;
		this.y = y;
	}

	public double getX()
	{
		return x;
	}

	public double getY()
	{
		return y;
	}

	/**
	 * Accessor method on immutable object. 
	 * Doesn't change object state but creates new object.
	 */
	public Point translate(double xMove, double yMove)
	{
		// XXX: won't compile. Point is immutable so return new object
		// x = x + xMove;
		return new Point(x + xMove, y + yMove);
	}

	public Point scale(double factor)
	{
		return new Point(x * factor, y * factor);
	}

	public static void main (String [] args)
	{
		Point p = new Point(3, 4).translate(1, 3).scale(0.5);
		System.out.println(p.getX());
		System.out.println(p.getY());

		LabeledPoint lp = new LabeledPoint("Onotole", 7, 8);
		System.out.println(lp.getLabel());
		System.out.println(lp.getX());
		System.out.println(lp.getY());
	}
}

class LabeledPoint extends Point
{
	private String label;

	public LabeledPoint()
	{
		// By default will be invoked no-args constructor
		this.label = "";
	}

	public LabeledPoint(String label, double x, double y)
	{
		// By default will be invoked no-args constructor
		super(x, y);
		this.label = label;
	}

	public String getLabel()
	{
		return label;
	}
}
