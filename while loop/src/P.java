class	P
	{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		while (i <=5)
			System.out.println("while loop stmt1" + i); //while is reading only this line
			System.out.println("while loop stmt2" + i);
			System.out.println("while loop stmt3" + i);
			i++ ;
						
		System.out.println("main end" + i);  
	}
	}
/*

there is no openig brace and closing in the while loop
so it n always  excute line no  9 but in line no 9 there is no increment or decrement 
so it is getting infinte loop

*/