import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class decry 
{
	public void decrypt()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String to decrypt");
		String st=scn.nextLine();
		List<String> s=new ArrayList<String>();
		int count=0;
		String n="";
		while(count<st.length())
		{
			s.add(st.substring(count, Math.min(count+4,st.length())));
			count+=4;
		}
		//System.out.println(s);
		//System.out.println(s.get(2).equals("$%^^"));
		for(int i=0;i<s.size();i++)
		{
			if(s.get(i).equals("Z$1@"))
			{
				n=n+"A";
			}
			else if(s.get(i).equals(".%d."))
			{
				n=n+"B";
			}
			else if(s.get(i).equals("ay#/"))
			{
				n=n+"C";
			}
			else if(s.get(i).equals("#tyA"))
			{
				n=n+"D";
			}
			else if(s.get(i).equals("@./|"))
			{
				n=n+"E";
			}
			else if(s.get(i).equals("-*+g"))
			{
				n=n+"F";
			}
			else if(s.get(i).equals(":><"))
			{
				n=n+"G";
			}
			else if(s.get(i).equals("i!i!"))
			{
				n=n+"H";
			}
			else if(s.get(i).equals("%#~9"))
			{
				n=n+"I";
			}
			else if(s.get(i).equals("(.)_"))
			{
				n=n+"J";
			}
			else if(s.get(i).equals("_(.)"))
			{
				n=n+"K";
			}
			else if(s.get(i).equals(">>?<"))
			{
				n=n+"L";
			}
			else if(s.get(i).equals("QjFl"))
			{
				n=n+"M";
			}
			else if(s.get(i).equals("&8Z$"))
			{
				n=n+"N";
			}
			else if(s.get(i).equals("W%$7"))
			{
				n=n+"O";
			}
			else if(s.get(i).equals("Fu#^"))
			{
				n=n+"P";
			}
			else if(s.get(i).equals("ck*V"))
			{
				n=n+"Q";
			}
			else if(s.get(i).equals("^9^X"))
			{
				n=n+"R";
			}
			else if(s.get(i).equals("D$OG"))
			{
				n=n+"S";
			}
			else if(s.get(i).equals("XX%$"))
			{
				n=n+"T";
			}
			else if(s.get(i).equals("%$9+"))
			{
				n=n+"U";
			}
			else if(s.get(i).equals("bcnH"))
			{
				n=n+"V";
			}
			else if(s.get(i).equals("A^@$"))
			{
				n=n+"W";
			}
			else if(s.get(i).equals("S$s&"))
			{
				n=n+"X";
			}
			else if(s.get(i).equals("@569"))
			{
				n=n+"Y";
			}
			else if(s.get(i).equals("Z:{]"))
			{
				n=n+"Z";
			}
			else if(s.get(i).equals("Z53$"))
			{
				n=n+"a";
			}
			else if(s.get(i).equals(".%d."))
			{
				n=n+"b";
			}
			else if(s.get(i).equals("S$-@"))
			{
				n=n+"c";
			}
			else if(s.get(i).equals("Z$L#"))
			{
				n=n+"d";
			}
			else if(s.get(i).equals("B$2}"))
			{
				n=n+"e";
			}
			else if(s.get(i).equals("(.)|"))
			{
				n=n+"f";
			}
			else if(s.get(i).equals("XxXx"))
			{
				n=n+"g";
			}
			else if(s.get(i).equals("~!^%"))
			{
				n=n+"h";
			}
			else if(s.get(i).equals(")(*&"))
			{
				n=n+"i";
			}
			else if(s.get(i).equals("$%^^"))
			{
				n=n+"j";
			}
			else if(s.get(i).equals("HV*$"))
			{
				n=n+"k";
			}
			else if(s.get(i).equals("A$?<"))
			{
				n=n+"l";
			}
			else if(s.get(i).equals("<@#!"))
			{
				n=n+"m";
			}
			else if(s.get(i).equals("<|l>"))
			{
				n=n+"n";
			}
			else if(s.get(i).equals("B*@#"))
			{
				n=n+"o";
			}
			else if(s.get(i).equals("(><)"))
			{
				n=n+"p";
			}
			else if(s.get(i).equals("H$()"))
			{
				n=n+"q";
			}
			else if(s.get(i).equals("~D$#"))
			{
				n=n+"r";
			}
			else if(s.get(i).equals("O$*I"))
			{
				n=n+"s";
			}
			else if(s.get(i).equals("|IgE"))
			{
				n=n+"t";
			}
			else if(s.get(i).equals("@^#$"))
			{
				n=n+"u";
			}
			else if(s.get(i).equals("F^*$"))
			{
				n=n+"v";
			}
			else if(s.get(i).equals("S5&>"))
			{
				n=n+"w";
			}
			else if(s.get(i).equals("/./:"))
			{
				n=n+"x";
			}
			else if(s.get(i).equals("6dtx"))
			{
				n=n+"y";
			}
			else if(s.get(i).equals("@&$f"))
			{
				n=n+"z";
			}
			else if(s.get(i).equals("<^^>"))
			{
				n=n+" ";
			}
			else
			{
				System.out.println("Tumse na ho paayega maamu");
			}
		}
		System.out.println(n);
		scn.close();
	}
}
