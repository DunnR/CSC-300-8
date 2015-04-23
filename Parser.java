
public class Parser 
{
	private String theStmt;
	private int pos; //where am I in the theStmt string
	
	public Parser(String theStmt)
	{
		this.theStmt = theStmt;
		this.pos = 0;
	}
	
	void parse()
	{
		this.parse_stmt();
	}
	
	private void parse_stmt()
	{
		String s = this.theStmt.replaceAll(" ", "");
		char assigned;
		char assignmentOP;
		char openPar;
		char closePar;
		char semiCol;
		char mathOp;
		char leftOfOP;
		char rightOfOP;
		
		for(int i = 0; i <= s.length() - 1; i++)
		{
			if(s.charAt(i) == '=')
			{
				assigned = s.charAt(i-1);
				assignmentOP = s.charAt(i);
				System.out.println("Beginning of Statement");
				System.out.println("Assignment varible: " + assigned);
				System.out.println("Assignment operator: " + assignmentOP);
			}
			if(s.charAt(i) == '(')
			{
				openPar = s.charAt(i);
				System.out.println("Start of Expression");
			}
			if(s.charAt(i) == ')')
			{
				closePar = s.charAt(i);
				System.out.println("End of Expression");
			}
			if(s.charAt(i) == '-' || s.charAt(i) == '*')
			{
				mathOp = s.charAt(i);
				leftOfOP = s.charAt(i - 1);
				rightOfOP = s.charAt(i + 1);
				System.out.println("Left : " + leftOfOP);
				System.out.println("Math Op: " + mathOp);
				System.out.println("Right: " + rightOfOP);
			}
			if(s.charAt(i) == ';')
			{
				semiCol = s.charAt(i);
				System.out.println("End of Statement");
			}
		}
		
	}
	
	private void parse_math_expr()
	{
		
	}
}
