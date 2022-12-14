import java.util.regex.Matcher;
import java.util.regex.Pattern;

class N5
{
	public static void main(String[] args) 
	{
		String src = "java8, java10,       java11,       java12,     oracle18";
		//String regex = "\\d";
		String regex = "\\d+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matches = pattern.matcher(src);
		while (matches.find())
		{
			System.out.println(matches.start() + ":" + matches.group());
		}
	}
}
/*

4:8
11:1
12:0
25:1
26:1
39:1
40:2
53:1
54:8

------------
for line no 10
4:8
11:10
25:11
39:12
53:18



*/ 