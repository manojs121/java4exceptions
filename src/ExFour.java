public class ExFour
{
public static void main(String args[])
{
	int x=0,y=0,z=0;

	try
	{
	x=Integer.parseInt(args[0]);
	y=Integer.parseInt(args[1]);


	if(y>x)
	{
		//ArithmeticException ob=new ArithmeticException();
		BigNoException ob=new BigNoException();
		throw ob;
	}


	z=x/y;


	}
	catch(ArithmeticException e)
	{
	System.out.println("ArithmeticException Handled");
	z=x/2;
	}
	catch(BigNoException e)
	{
	e.show();
	//System.out.println(e);
	//System.out.println("Second No Must Be Smaller Always");
	}

	System.out.println("Result : "+z);
	System.out.println("End-of-Main");
}
}