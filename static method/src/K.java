class  K
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("main maiddle");
		if (true)
		{
			return ;
		}
		
		System.out.println("main end");
	}
}
/**
main begin
main middle

main end is not excuting becouse of the return
there is a return stmt without a value so  it is valid 



*/