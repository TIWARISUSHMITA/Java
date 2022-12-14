class  H
{
	static byte p;
	static short q;
	static int r;
	static long s;
	static float t;
	static double u;
	static boolean v;
	static char w;
	static int[] x;
	static String y;
	static String[] z;

	public static void main(String[] args) 
	{
		System.out.println("byte :" +p); 
		System.out.println("short :" +q);
		System.out.println("int :" +r);
		System.out.println("long :" +s);
		System.out.println("float :" +t);
		System.out.println("double:" +u);
		System.out.println("boolean:" +v);
		System.out.println("char:" +w); // /u0000 it is unable to disply in the commend prmpt but oits default value is slase u with four zero(\u0000)
		System.out.println("int[]:" +x);
		System.out.println("String: " +y);
		System.out.println("String[]: " +z);
		
		
		}
}
/*
byte :0
short :0
int :0
long :0
float :0.0
double:0.0
boolean:false
char:
int[]:null
String: null
String[]: null
 
 any type of arry[] which is derived data type is null value
in java arry type considerd as a derived  data type is null
any type of data type id default is null


*/