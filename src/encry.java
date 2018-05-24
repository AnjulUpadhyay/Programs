
public class encry 
{
	public void encrypt(String st)
	{
		char[] a=st.toCharArray();
		String n="";
		for(int i=0;i<a.length;i++)
		{
			switch(a[i])
			{
				case 'A': n=n+"Z$1@";
				break;
				case 'B': n=n+".%d.";
				break;
				case 'C': n=n+"ay#/";
				break;
				case 'D': n=n+"#tyA";
				break;
				case 'E': n=n+"@./|";
				break;
				case 'F': n=n+"-*+g";
				break;
				case 'G': n=n+":><";
				break;
				case 'H': n=n+"i!i!";
				break;
				case 'I': n=n+"%#~9";
				break;
				case 'J': n=n+"(.)_";
				break;
				case 'K': n=n+"_(.)";
				break;
				case 'L': n=n+">>?<";
				break;
				case 'M': n=n+"QjFl";
				break;
				case 'N': n=n+"&8Z$";
				break;
				case 'O': n=n+"W%$7";
				break;
				case 'P': n=n+"Fu#^";
				break;
				case 'Q': n=n+"ck*V";
				break;
				case 'R': n=n+"^9^X";
				break;
				case 'S': n=n+"D$OG";
				break;
				case 'T': n=n+"XX%$";
				break;
				case 'U': n=n+"%$9+";
				break;
				case 'V': n=n+"bcnH";
				break;
				case 'W': n=n+"A^@$";
				break;
				case 'X': n=n+"S$S&";
				break;
				case 'Y': n=n+"@569)";
				break;
				case 'Z': n=n+"Z:{]";
				break;
				case 'a': n=n+"Z53$";
				break;
				case 'b': n=n+".%d.";
				break;
				case 'c': n=n+"S$-@";
				break;
				case 'd': n=n+"Z$L#";
				break;
				case 'e': n=n+"B$2}";
				break;
				case 'f': n=n+"(.)|";
				break;
				case 'g': n=n+"XxXx";
				break;
				case 'h': n=n+"~!^%";
				break;
				case 'i': n=n+")(*&";
				break;
				case 'j': n=n+"$%^^";
				break;
				case 'k': n=n+"HV*$";
				break;
				case 'l': n=n+"A$?<";
				break;
				case 'm': n=n+"<@#!";
				break;
				case 'n': n=n+"<|l>";
				break;
				case 'o': n=n+"B*@#";
				break;
				case 'p': n=n+"(><)";
				break;
				case 'q': n=n+"H$()";
				break;
				case 'r': n=n+"~D$#";
				break;
				case 's': n=n+"O$*I";
				break;
				case 't': n=n+"|IgE";
				break;
				case 'u': n=n+"@^#$";
				break;
				case 'v': n=n+"F^*$";
				break;
				case 'w': n=n+"S5&>";
				break;
				case 'x': n=n+"/./:";
				break;
				case 'y': n=n+"6dtx";
				break;
				case 'z': n=n+"@&$f";
				break;
				case ' ': n=n+"<^^>";
				break;
				default: System.out.println("Kuch Gadbad hai bhai tuj me ");
				break;
			}
			//System.out.println(a[i]);
		}
		System.out.println(n);
	}

}
