package chap01;

public class PermutationString_2 {
	public boolean isPermutation(String s1, String s2)
	{
		if (s1.length() != s2.length())
			return false;
		int[] charNum_1 = new int[256];
		int[] charNum_2 = new int[256];
		
		for (int i = 0; i < 256; i++)
		{
			charNum_1[i] = 0;
			charNum_2[i] = 0;
		}
		
		for (int j = 0; j < s1.length(); j++)
		{
			int val_1 = s1.charAt(j);
			int val_2 = s2.charAt(j);
			
			charNum_1[val_1]++;
			charNum_2[val_2]++;
			
		}
		
		for (int i = 0; i < 256; i++)
			if (charNum_1[i] != charNum_2[i])
				return false;
		
		
		return true;
	}
	public static void main(String[] args) {
		PermutationString x = new PermutationString();
		String s1 = "abcdea";
		String s2 = "edcbae";
		boolean isPer = x.isPermutation(s1, s2);
		System.out.println(isPer);
	}

}
