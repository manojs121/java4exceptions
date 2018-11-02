import java.io.*;
public class ExFive
{
public static void main(String args[]) throws FileNotFoundException, IOException
{
	String fname=args[0];
	FileInputStream fis=new FileInputStream(fname);
	System.out.println("File Opened");
	int n=fis.read();
}
}