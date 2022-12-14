class G 
{
	public static void main(final String[] args) 
	{
		args = null;//attempting to modifying
		System.out.println("Hello World!");
	}
}
/*

args is not reinitialize becouse in method it is final 
in java commond the value which is main method is always final

G.java:5: error: final parameter args may not be assigned
                args = null;
                ^
1 error
*/
