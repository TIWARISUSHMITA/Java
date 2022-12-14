import java.util.regex.Matcher;
import java.util.regex.Pattern;

class N3
{
	public static void main(String[] args) 
	{
		String src = "Hello and Hello and Hello Again and Again"; //source
		//String regex = "a"; //search String 
		//String regex = "ali";
		//String regex = "[ali]";
		//String regex = "[b-m]"; //read the char till b to m
		//String regex = "[b-el-p]";
		//String regex = "[b-el-pH]";
		String regex = "\\s";//slase s represents space
		Pattern pattern = Pattern.compile(regex);
		Matcher matches = pattern.matcher(src);
		while (matches.find())
		{
			System.out.println(matches.start() + ":" +matches.group());
		}
		
	}
}
/*
6:a
16:a
28:a
32:a
38:a

------
line no 10 not compiled
------
line no 11 compiled
it looking every occurance of a,l,i
it will looking for every char seperatly
2:l
3:l
6:a
12:l
13:l
16:a
22:l
23:l
28:a
29:i
32:a
38:a
39:i

---------
1:e
2:l
3:l
8:d
11:e
12:l
13:l
18:d
21:e
22:l
23:l
27:g
29:i
34:d
37:g
39:i

---------
for line no 13
1:e
2:l
3:l
4:o
7:n
8:d
11:e
12:l
13:l
14:o
17:n
18:d
21:e
22:l
23:l
24:o
30:n
33:n
34:d
40:n
-----------
for line n0 14
0:H
1:e
2:l
3:l
4:o
7:n
8:d
10:H
11:e
12:l
13:l
14:o
17:n
18:d
20:H
21:e
22:l
23:l
24:o
30:n
33:n
34:d
40:n
------------
line no 15

5:
9:
15:
19:
25:
31:
35:
*/