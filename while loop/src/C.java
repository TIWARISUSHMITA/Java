class	C
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		while (i<=5)
		{
			System.out.println("while loop body:" + i++);
			
		}
		System.out.println("main end" +i);  //6
	}
}
/*

while loop body: 1
while loop body: 2
while loop body: 3
while loop body: 4
while loop body: 5
main end 6
*/