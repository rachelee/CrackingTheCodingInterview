package chap01;

public class StringCompre {
	public static String compress(String s)
	{
		int size = countSize(s);
		//System.out.println(size);
		if (size > s.length())
			return s;
		
		char last = s.charAt(0);
		char[] sArray = new char[size];
		int index = 0;
		int count = 1;
		
		for (int i = 1; i < s.length(); i++)
		{
			if (s.charAt(i) == last)
				count++;
			else
			{
				index = setChar(sArray, index, last, count);
				count = 1;
				last = s.charAt(i);
			}
		}
		return String.valueOf(sArray);
	}
	
	public static int setChar(char[] sArray, int index, char c, int count)
	{
		sArray[index] = c;
		index++;
		
		char[] charNum = String.valueOf(count).toCharArray();
		for(char x: charNum)
		{
			sArray[index] = x;
			index++;
		}
		//System.out.println(charNum.toString());
		return index;
	}
	public static int countSize(String s)
	{
		int size = 0;
		int count = 1;
		char last = s.charAt(0);
		for (int i = 1; i < s.length(); i++)
		{
			if (s.charAt(i) == last)
				count++;
			else
			{
				size = size + 1 + String.valueOf(count).length();
				count = 1;
				last = s.charAt(i);
			}
				
		}
		return size+1+String.valueOf(count).length();
	}
	
	public static void main(String[] args) {
		String s = "aaabbcdeeee";
		s = compress(s);
		System.out.println(s);
	}

}
