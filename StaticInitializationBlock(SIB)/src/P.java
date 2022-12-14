class  P
{
	int i ;
	static void test(P p1)
	{
		System.out.println("from test : " + p1);
		System.out.println("from test : " + p1.i);

	}
	public static void main(String[] args) 
	{
		P ref = new P();
		ref.i = 100;
		System.out.println("from main : " + ref);
		System.out.println("from main : " + ref.i);
		test(ref);
		P.test(ref);
		ref.test(ref);  //P.test(ref)
	}
}
/*

from main : P@15db9742
from main : 100
from test : P@15db9742
from test : 100
from test : P@15db9742
from test : 100
from test : P@15db9742
from test : 100
method can take an argument
test method teke an arugement
in body of main method in line no 16 17 18 we are calling test method
here ref is assigninh p1
p1 is P type ref is also P type
in this only only one object is creating

*/
