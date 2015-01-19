package chap01;
import java.util.Arrays;
public class PermutationString {
	public boolean isPermutation(String s1, String s2)
	{
		if (s1.length() != s2.length())
			return false;
		char[] chars_1 = s1.toCharArray();
		char[] chars_2 = s2.toCharArray();
		Arrays.sort(chars_1);
		Arrays.sort(chars_2);
		for (int i = 0; i < s1.length(); i++)
		{
			if (chars_1[i] != chars_2[i])
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		PermutationString x = new PermutationString();
		String s1 = "abcdee";
		String s2 = "edcbae";
		boolean isPer = x.isPermutation(s1, s2);
		System.out.println(isPer);
	}

}
