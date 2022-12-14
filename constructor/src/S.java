class  S
{
	S()
	{
	
	//	this(90); //second condition
		System.out.println("S()");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/*

int argument constructor not avilable
compilation error
while developing this calling stmt in the constructor body 
if the another constructor is not avilable we will be getting compilation error
if we are keepint this() in a comment in this case the programe will excute its no matter that object is creating or not
becouse in this file constructer was created but without any object which is avilable in main method

*/