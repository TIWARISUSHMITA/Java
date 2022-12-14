class  R
{
	public static void main(String[] args) 
	{
		System.out.println(Q.i);
	}
}
/*
R.java:5: error: cannot find symbol
                System.out.println(Q.i);
                                   ^
  symbol:   variable Q
  location: class R
1 error

becouse in class Q is not saveed in Q.java it saved in other
name like ABC.java
so compile time error becouse R.java class is totaly depend on Q.java class 

if class is non public them=n we can the file name with any name 
but not advisable 
*/