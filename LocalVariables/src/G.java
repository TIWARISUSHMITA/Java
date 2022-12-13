class G 
{
	public static void main(String[] args) 
	{
		int i = 1;
		int j = ++i   +   i  +   ++i   +   ++i   +   i    +     ++i;
		    //   2        2      3          4        4           5  = 20
		System.out.println(i); //5
		System.out.println(j);   //20
	}
}
