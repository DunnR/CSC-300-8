
public class Driver 
{
	public static void main(String[] args)
	{
		Parser p = new Parser("     a =     (a *   b) - c;");
		Parser p2 = new Parser("     a = b - c;");
		String s = "     a =     (a *   b) - c;";
		String s2 = s.replaceAll(" ","");
		System.out.println(s2);
		System.out.println(s);
		p2.parse();
	}
}
