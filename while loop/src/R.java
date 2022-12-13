class	R
	{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 5;
		while (i <=10)
			System.out.println("while loop stmt1 :" + i++); //5	,6,7,8,9 becouse of loop it excuting while the value is 9				
			System.out.println("while loop stmt2 :" + i++); 	//10				
			System.out.println("while loop stmt3 :" + i++); //711				
			System.out.println("while loop stmt4 :" + i++); 	//12				
		System.out.println("main end" + i);  //13
	}
	}
