class M13 
{
	static int test(Integer obj)
	{
		return obj;  //returning obj.intValue();
	}
	public static void main(String[] args) 
	{
		int i = 10;
		Integer obj = test(i);  //	Integer obj = new Integer(test(new Integer(i)));
		System.out.println("done");
	}
}
/*
done
total three conversion is done here
*/