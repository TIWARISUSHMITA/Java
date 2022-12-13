class	T
	{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 5;
		while (i++ <=10) ; //no body so it only excute not print the value till 11 then come back in line no 8
			System.out.println("while loop stmt1 :" + i++); //12				
			System.out.println("while loop stmt2 :" + i++); //13			
			System.out.println("while loop stmt3 :" + i++); //14				
			System.out.println("while loop stmt4 :" + i++); //15			
		System.out.println("main end" + i);  //16
	}
	}
/*
main begin
while loop stmt1 :12
while loop stmt2 :13
while loop stmt3 :14
while loop stmt4 :15
main end16

*/