class  X
{
	static int i = test();  //iniatilizer
	static int j = test();  //iniatilizer
	public static int test()
	{
		System.out.println("from test : " +i +"," +j);
		i += 1; //i= i+1;  /1 /1+6=7
		j += 2; //j= j+2   /2
		return i + j +3 ;	//6 /7+4+3=14
	}
	public static void main(String[] args) 
	{
		System.out.println("from main : " +i + "," +j);

	}
}
/*
from test : 0,0
from test : 6,2
from main : 7,14
every initializer has to excute from top to bottom then main method


every inializer should excute before main method
if inializers excution got over then only it reads main method


*/