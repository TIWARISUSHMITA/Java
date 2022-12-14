class S
{
	final int i ;
	S()
	{
		i= 0; 
	}
	S(int i)
	{
		this.i = 20;  //global is accessing
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/*
Hello World!
we can gurenteed is final non static is constant


*/