class R
{
	final int i ;
	R()
	{
		i= 0; 
	}
	R(int i)
	{
		this.i = 0;  //global is accessing
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/*
Hello World!


*/