class  R
{
	static int i ;
	public static void test()
	{
	System.out.println("test : " +i);
	i = 20;
	}
	public static void main(String[] args) 
	{
		System.out.println("main : " +i);
		i = 10;
		test();
		System.out.println("main : " +i);
	}
}
/*

main : 0
test : 10
main : 20
becouse of same i test colmn i  main colomn i 
inialiy main method is excuting main : 0
then i value is modified and stored in the global now 
global is modified with 10
then excute test method test : 10
now agin i value is modified with the help of test method and stored in the global 
now i value is modified with 20 then
in last main it printing main : 20 becouse of globale variable


*/