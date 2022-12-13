class  D
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		double[] elements = {1.0,20.6,30.5,10.00,5.80,60.45};
		double element;
		for ( element:elements )
		{
			System.out.println(element);
		}
		System.out.println("main end : ");
	}
}
/*
compilaton error
element should not be declare before for loop
so it can  to be allow to use after words but it is only reading purpose

D.java:8: error: bad initializer for for-loop
                for ( element:elements )
                      ^
1 error
we can not use line no 7

*/