import java.util.regex.Matcher;
import java.util.regex.Pattern;

class N2 
{
	public static void main(String[] args) 
	{
		String src = "Hello and Hello and Hello Again and Again"; //source
		String regex = "Hello"; //search String  
		Pattern pattern = Pattern.compile(regex);
		Matcher matches = pattern.matcher(src);
		while (matches.find())
		{
			System.out.println(matches.start() + ":" +matches.group());
		}
		
	}
}
/*

0:Hello
10:Hello
20:Hello

*/