class  M5
{
	public static void main(String[] args) 
	{
		String i = "20.5";
		Double obj1 = new Double(i);
		Double obj2 =Double.valueOf(i);
		System.out.println("boxing done");
	}
}
/*
in every wrapper class we use constructor
String content we are taking as wrapper object


boxing done
*/