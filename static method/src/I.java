class  I
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("main middle");
		System.out.println("main end");
		return 100; //return stmt with a value is not allow

	}
}
/**
return stmt with a value is not allow
I.java:8: error: incompatible types: unexpected return value
                return 100;
                       ^
1 error
every method should have return type
return is a mandatury  for every methd 
return typt should bbe before name of a method
there three a different return typt avilable
1 = void
2 = any primitive data type
3 = any derived data type
no first let us see void in next program then others 
void means it should not  return a value
if it should not return a value  thatswhy return stmt is not mandutriy
if we want to  keep a return stmt so we keep it but without a value
with value it will an error
*/