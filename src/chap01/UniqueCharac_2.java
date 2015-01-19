package chap01;

public class UniqueCharac_2 {
	public boolean isUnique(String s)
	{
		if (s.length() > 128)
			return false;
		boolean[] charArray = new boolean[256];
		for (int i = 0; i < s.length(); i++)
		{
			int charNum = s.charAt(i);
			if (charArray[charNum])
				return false;
			charArray[charNum] = true;
		}
			
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniqueCharac_2 x = new UniqueCharac_2();
		String s = "abcdee";
		boolean stringUnique = x.isUnique(s);
		System.out.println(stringUnique);
	}

}
