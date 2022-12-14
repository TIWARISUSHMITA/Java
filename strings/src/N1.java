import java.util.regex.Matcher;
import java.util.regex.Pattern;

class N1 
{
	public static void main(String[] args) 
	{
		String src = "hello and Hello and Hello Again and Again";
		String regex = "and";
		Pattern pattern = Pattern.compile(regex);
		Matcher matches = pattern.matcher(src);
		while (matches.find())
		{
			System.out.println(matches.start() + ":" +matches.group());
		}
		
	}
}
/*
regex means regular expression
here line no 6 means find out the index no of and

6:and
16:and
32:and

*/