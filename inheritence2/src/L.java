class  L
{
	L()
	{
		System.out.println("L()"); //super calling stmt
	}

	{
		System.out.println("L-IIB"); //
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		L obj =  new L();
		System.out.println("main end");
	}
}
/*
there is no inheritence 
if any constructor is direct in above then the IIB it is known as super callin stmt
if the IIB stmt is immidiatly after super calling stmt then it is moved in the constructor body or super calling stmt
no matter hwo many construcots are avilable
in super calling stmt first IIB excutes then constructor with no argument

main begin
L-IIB
L()
main end


*/
