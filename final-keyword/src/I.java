class I 
{
	int x ;
	public static void main(String[] args) 
	{
		final I obj = new I();
		obj.x = 10;  //x is not final obj is final nut be are not modifying the obj
		System.out.println("done");
	}
}
