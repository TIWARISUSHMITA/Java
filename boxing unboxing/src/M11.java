class  M11
{
	public static void main(String[] args) 
	{
		int i = 10;
		Integer obj = new Integer(i);  //boxing
		int j = obj;  //int j = obj.intValue();
		int k = 20;
		obj = k;      //obj = new Intger(k);
		System.out.println("done");
	}
}
/*

done
compiler only boxing 
*/

