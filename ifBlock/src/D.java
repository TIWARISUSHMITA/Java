class D
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
        if(true)
		{
		System.out.println("if -block-stmt1");
		System.out.println("if -block-stmt2");
		System.out.println("if -block-stmt3");
		System.out.println("if -block-stmt4");
		}

		System.out.println("main end");
	}
}
/*main begin 

if-block-stmt1
if-block-stmt2
if-block-stmt3
if-block-stmt4
main end
*/