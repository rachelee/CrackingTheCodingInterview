package chap01;
class StringUnique
{
	String classString;
	StringUnique(String s)
	{
		classString = s;
	}
	boolean UniqueTest()
	{
		boolean unique = true;
		for (int i = 0; i < classString.length(); i++)
		{
			char c = classString.charAt(i);
			for (int j = i+1; j < classString.length(); j++)
				if (c == classString.charAt(j))
					unique = false;
		}
		return unique;
	}
}
public class UniqueCharac {

	public static void main(String[] args) {
		String myString;
		myString = "abcdeff";
		StringUnique stringClass = new StringUnique(myString);
		boolean isUnique = stringClass.UniqueTest();
		System.out.println("Unique: "+ isUnique);
		/*String s = "abcd";
		for (int i = 0; i < s.length(); i++)
		{
			int val = s.charAt(i);
			System.out.println(val);
		}*/
	}

}
