import java.util.Scanner;
public class Encryption 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		//System.out.println("Enter your words to converts in secret code");
		String st=s.nextLine();
		encry e=new encry();
		e.encrypt(st);
		decry d=new decry();
		d.decrypt();
		s.close();
	}
	
	//commenting this
	//
}
