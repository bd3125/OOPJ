import java.io.*;
import java.util.*;

class Test_Overloading
{
public static void main(String args[])
{
System.out.println(Adder.add(11,11));
System.out.println(Adder.add(12.5,30.3,12.56));
}
}

class Adder
{
static int add(int a,int b){return a+b;
}
static double add(double a,double b,double c)
{
return a+b+c;
}
}