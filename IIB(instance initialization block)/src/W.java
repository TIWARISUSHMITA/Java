class W 
{
	W()
	{
		System.out.println("W():" +i);
	}

	{
	W w1 = new W(); //creat object
	System.out.println("IIB:"+ w1.i); //Iidirect read becouse of ...
	}
	int i;
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
/*

*/