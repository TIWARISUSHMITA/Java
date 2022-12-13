class  C
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		double[] elements = {1.0,20.6,30.5,10.00,5.80,60.45};
		for (double element:elements )
		{
			System.out.println(element);
		}
		System.out.println("main end : " + element);
	}
}
/*
element can  not use from out side

C.java:11: error: cannot find symbol
                System.out.println("main end : " + element);
                                                   ^
  symbol:   variable element
  location: class C
1 error

*/