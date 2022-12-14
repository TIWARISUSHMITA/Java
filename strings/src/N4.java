import java.util.regex.Matcher;
import java.util.regex.Pattern;

class N4 
{
	public static void main(String[] args) 
	{
		String src = "java8, java10,       java11,       java12,     oracle18";
	//	String regex = "\\s";
	String regex = "\\s+"; //+ stands for one or more
		Pattern pattern = Pattern.compile(regex);
		Matcher matches = pattern.matcher(src);
		while (matches.find())
		{
			System.out.println(matches.start() + ":" + matches.group());
		}
	}
}
/*
6:
14:
15:
16:
17:
18:
19:
20:
28:
29:
30:
31:
32:
33:
34:
42:
43:
44:
45:
46:
------------for line no 
6:
14:
28:
42:
*/