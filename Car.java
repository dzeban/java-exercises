class Car {
	private int distance;
	private double fuel;
	private double fuelEfficiency;

	public Car(double fuelEfficiency)
	{
		this.fuelEfficiency = fuelEfficiency;
	}

	public void travel(int miles)
	{
		fuel -= miles / fuelEfficiency;		 
		distance += miles;
	}

	public void fill(double gallons)
	{
		fuel += gallons;
	}

	public int getDistance()
	{
		return distance;
	}

	public double getFuel()
	{
		return fuel;
	}

	public static void main (String [] args)
	{
		Car car = new Car(4);

		car.fill(10);
		car.travel(2);
		car.travel(4);
		System.out.println(car.getDistance());
		System.out.println(car.getFuel());
	}
}
