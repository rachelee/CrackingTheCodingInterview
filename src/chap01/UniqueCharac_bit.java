package chap01;

public class UniqueCharac_bit {
	public boolean isUnique(String s)
	{
		int checker = 0;
		for (int i = 0; i < s.length(); i++)
		{
			int val = s.charAt(i) - 'a';
			if ((checker & (1 << val)) > 0)
				return false;
			checker |= (1 << val);
		}
		return true;
	}
	public static void main(String[] args) {
		UniqueCharac_bit x = new UniqueCharac_bit();
		String s = "abcde";
		boolean stringUnique = x.isUnique(s);
		System.out.println(stringUnique);

	}

}
