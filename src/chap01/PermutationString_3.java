package chap01;

public class PermutationString_3 {
	public boolean isPermutation(String s1, String s2)
	{
		if (s1.length() != s2.length())
			return false;
		int[] charNum = new int[256];
		for (int i = 0; i < s1.length(); i++)
		{
			int index = s1.charAt(i);
			charNum[index]++;
		}
		
		for (int j = 0; j < s2.length(); j++)
		{
			int c = s2.charAt(j);
			if (--charNum[c] < 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		PermutationString x = new PermutationString();
		String s1 = "abcde3";
		String s2 = "edcbae";
		boolean isPer = x.isPermutation(s1, s2);
		System.out.println(isPer);
	}

}
