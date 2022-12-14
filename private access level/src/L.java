class  K
{
	private int i;
}
class L extends K
{
	public static void main(String[] args) 
	{
		L obj = new L();

		System.out.println(obj.i);
	}
}
/*
L.java:11: error: i has private access in K
                System.out.println(obj.i);
                                      ^
1 error
private members are not invove(surviving) in inheritence

*/