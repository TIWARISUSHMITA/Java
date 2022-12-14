class W
{
	W()
	{
	System.out.println("w()");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		W w1 = new W();
		System.out.println("main end");
	}
}
/*
main begin
W()
main end

here two constructor is excuted bwhich is in the W()
and second one is through the object in line non10
*/