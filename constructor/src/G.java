class G
{
	int i ; 
	G(int x) //constructor with parameter \opr argument
	//or paremerterzied constructor
	{
		i = x;
	}
	public static void main(String[] args) 
	{
		G g1 = new G(90); //creating a new object
		System.out.println(g1.i);
		G g2 = new G(910); //creating a new object
		System.out.println(g2.i);
		G g3 = new G(901); //creating a new object
		System.out.println(g3.i);
		G g4 = new G(500); //creating a new object
		System.out.println(g4);
		
	}
}
/*
constructor can take any no of argumrnt
90
910
901
G@15db9742
in line no 18 g4 don't have the value of i thatswhy it is giving the hashcode value
*/