class M62 
{
	public static void main(String[] args) 
	{
		try
		{
			//some stmt
		}
		catch (Throwable ex)
		{
		}	
		catch (Exception ex)
		{
		}
		catch (RuntimeException ex)
		{
		}
		catch (NullPointerException ex)
		{
		}
	}
}
/*
M62.java:12: error: exception Exception has already been caught
                catch (Exception ex)
                ^
M62.java:15: error: exception RuntimeException has already been caught
                catch (RuntimeException ex)
                ^
M62.java:18: error: exception NullPointerException has already been caught
                catch (NullPointerException ex)
                ^
3 errors

last three catch can not be reachable
*/
