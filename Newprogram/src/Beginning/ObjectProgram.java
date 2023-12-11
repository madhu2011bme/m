package Beginning;

public class ObjectProgram 
{
	public static void main(String[] args) 
	{
		String s1="WELCOME";
		String s2="HOME";
		{
			System.out.println(s1.length());
			System.out.println(s1+" "+s2);
			System.out.println(s1.concat(s2));
			System.out.println(s1.equals(s2));
			System.out.println(s2.contains("OME"));
			System.out.println(s1.substring(0,3));
			System.out.println(s1.replace('E','A'));
		}

		}
}	