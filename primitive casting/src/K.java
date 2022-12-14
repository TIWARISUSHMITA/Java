class K
{
	public static void main(String[] args) 
	{
		int x = 129;
		byte y = 10;
		y = (byte)x;
		System.out.println(x+", "+y);
	}
}
/*
narrowing or explicit
wider can not be converted automatically by compiler automaticlly
firstly it takes the value of int which is 129
then count the byte maximum value and compair with int x value  that hwo much is greater then byte value
then subtract the minimum value of byte into int and give the answer

129, -127

*/