class C
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		
		do
		{
			int i = 10;
			System.out.println("do -while : " +i);
			i++ ;
		}
		while (i <= 5 );
		//System.out.println("main end : " +i);
	}
}

/* 
compile time error
two condition
1= in this (while (i <= 5 );) loop have to semicolomn otherwise getting error
2= body and boolean condition both of related to do while
i is declaring in the body of do

*/