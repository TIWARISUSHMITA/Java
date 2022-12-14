class  B
{
	static int i;
	public static void main(String[] args) 
	{
		System.out.println(i); //0 it takes global value
		i = 10; //then i is modified
		System.out.println(i); //10 nnow i value is 10
	}
}
