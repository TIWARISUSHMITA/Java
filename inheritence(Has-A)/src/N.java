class N 
{
	N member;

	public static void main(String[] args) 
	{
		N obj1 = new N();
		obj1.member = new N();
		System.out.println("done");
	}
}
/*
done
we can assign the member in line no 8 but 
if it assigning in line no 7
it takes null and going to stack full error
*/