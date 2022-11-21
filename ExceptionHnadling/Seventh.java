//IllegalArgumentException
class Seventh
{
    public static void main(String[] args)
    {
        Thread t= new Thread();
       // t.setPriority(10);
        t.setPriority(1000);
    }
}
/*
Exception in thread "main" java.lang.IllegalArgumentException
        at java.lang.Thread.setPriority(Thread.java:1089)
        at Seventh.main(Seventh.java:6)
        */