class RunnableGreeter implements Runnable
{
	private int n;
	private String target;

	RunnableGreeter(int n, String target)
	{
		this.n = n;
		this.target = target;
	}

	public void run()
	{
		for (int i = 0; i < n; i++)
		{
			System.out.println("Hello, " + target);
		}
	}
	
	public static void main (String [] args)
	{
		RunnableGreeter rg1 = new RunnableGreeter(30, "Steven");
		RunnableGreeter rg2 = new RunnableGreeter(50, "Kevin");

		Thread t1 = new Thread(rg1);
		Thread t2 = new Thread(rg2);
		t1.start();
		t2.start();
	}
}
