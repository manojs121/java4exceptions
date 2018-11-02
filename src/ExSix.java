import java.io.*;
public class ExSix
{

public static void div(int a, int b)
{
	System.out.println("Start-of-div");
	try
	{
	System.out.println(a/b);
	}
	catch(Exception e)	
	{
	System.out.println("Handled By Div");
	}
	System.out.println("End-of-div");
}

public static void callDiv(int p, int q)
{
	System.out.println("Start-of-callDiv");
	try
	{
	div(p,q);
	}
	catch(Exception e)
	{
	System.out.println("Handled By CallDiv");
	}
	System.out.println("End-of-callDiv");
}



public static void main(String args[]) 
{
	System.out.println("Start-of-main");
	int x=0,y=0;
	x=Integer.parseInt(args[0]);
	y=Integer.parseInt(args[1]);
	try
	{
	callDiv(x,y);
	}
	catch(Exception e)
	{
	System.out.println("Handled By Main");
	}
	System.out.println("End-of-main");
}
}