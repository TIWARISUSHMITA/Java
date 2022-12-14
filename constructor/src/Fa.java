class Fa
{
	
	Fa()
	{
		i = 200; //this.i=200;

	}
	public static void main(String[] args) 
	{
		Fa fa1 = new Fa();
		System.out.println(fa1);
		Fa fa2 = new Fa();
		System.out.println(fa2);
		Fa fa3 = new Fa();
		System.out.println(fa3);
		
	}
}
/*
compilation error
i could not find the symbol i
in the classes Fa no global variable is avilable only  local variable is created in the constructer body thats why the main method don't get the value of i 

*/