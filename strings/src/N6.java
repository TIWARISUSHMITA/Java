import java.util.regex.Matcher;
import java.util.regex.Pattern;

class N6
{
	public static void main(String[] args) 
	{
		String src = "java@java.com";
	//	String regex = "@";
	    String regex = ".";
		Pattern pattern = Pattern.compile(regex);
		Matcher matches = pattern.matcher(src);
		while (matches.find())
		{
			System.out.println(matches.start() + ":" + matches.group());
		}
	}
}
/*
4:@
----
for line no 9

0:j
1:a
2:v
3:a
4:@
5:j
6:a
7:v
8:a
9:.
10:c
11:o
12:m

*/ 