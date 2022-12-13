class	S
	{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 5;
		while (i <=10) ;
			System.out.println("while loop stmt1 :" + i++); //5 				
			System.out.println("while loop stmt2 :" + i++); //6				
			System.out.println("while loop stmt3 :" + i++); //7 				
			System.out.println("while loop stmt4 :" + i++); //8				
		System.out.println("main end" + i);  //9
	}
	}
