class B
{
	public static void main(String[] args) 
	{
		
		System.out.println("main begin");
		for (int i =10; i >=5 ; i-- ) //for loop header
       // ( initializtion   boolean expression   changes ) 

		{
			System.out.println("loop begin:" +i);
			System.out.println("loop end:" +i);
			System.out.println("============");
		}
		System.out.println("main end");
	}
}
/*
if tere is no opening braces  so it reads only one stmt 
initializa tion excute only one time
boolean expression check the contion 
it excuting for every iteration
it excute every time
changes is  increment and decrement
it excute from the second iteration not from the first iteration

*/