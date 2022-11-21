//FileNotFoundException
import java.io.*;
class Four
{
    public static void main(String[] args){
        PrintWriter pw = new PrintWriter("abc.txt");
        pw.println("hello ,pro stack ");
    }

}
/*
Four.java:5: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
        PrintWriter pw = new PrintWriter("abc.txt");
                         ^
1 error
*/