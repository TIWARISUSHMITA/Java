class K 
{
	public static void main(String[] args) 
	{
		int i = 0;
		int j = i++;
		System.out.println(i); //1
		System.out.println(j);  //0
		int p = 5;
		int q = p--;
		System.out.println(p); //4
		System.out.println(q);  //5
	}
}
