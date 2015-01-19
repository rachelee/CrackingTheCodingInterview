package chap01;
import java.util.Arrays;



public class ReplaceSpace {
	public char[] replace(char[] s, int length)
	{
		int spaceNum = 0;
		for (int i = 0; i < length; i++)
			if (s[i] == ' ')
				spaceNum++;
		int lengthNew = length+spaceNum*2+1;
		System.out.println(lengthNew);
		char[] sNew = new char[lengthNew];
		System.out.println(sNew);
		sNew[--lengthNew] = '\0';
		for (int i = length-1; i >= 0; i--)
		{
			if (s[i] != ' ')
			{
				sNew[lengthNew-1] = s[i];
				lengthNew--;
			}
			else
			{
				sNew[lengthNew-1] = '0';
				sNew[lengthNew-2] = '2';
				sNew[lengthNew-3] = '%';
				lengthNew =lengthNew - 3;
			}
			
		}
		
		return sNew;
				
		
	}
	public static void main(String[] args) {
		char[] a1 = {'I', 'l', 'i', ' ', 'e'};
		char[] a2;
		ReplaceSpace x = new ReplaceSpace();
		a2 = x.replace(a1,5);
		System.out.println("Result: ");
		System.out.println(Arrays.toString(a2));
	}


}
