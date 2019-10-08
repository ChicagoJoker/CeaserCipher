
public class CeaserCipher {
	public static String encrypt (String plainText, int shift)
	{
		if(shift > 26)
		{
			shift = shift % 26;
		}
		String cipherText = "";
		int length = plainText.length();
		for(int i = 0; i < length; i++)
		{
			char ch = plainText.charAt(i);
			char c = (char)(ch + shift);
			if(c > 'z')
			{
				cipherText = cipherText + ((char)(ch - (26 - shift)));
			}
			else if(c >= 'a' && c <= 'z')
			{
				cipherText += c;
			}
			else
			{
				cipherText += ch;
			}
		}
		return cipherText;
	}
	
	public static String decrypt (String plainText, int shift)
	{
		if(shift > 26)
		{
			shift = shift % 26;
		}
		String decryptText = "";
		char c;
		int length = plainText.length();
		for(int i = 0; i < length; i++)
		{
			c = plainText.charAt(i);
			if(c >= 'a' && c <= 'z')
			{
				c = (char)(c - shift);
				if(c < 'a')
				{
					c = (char)(c + 'z' - 'a' + 1);
				}
				decryptText += c;
			}
			else
			{
				decryptText += c;
			}
		}
		return decryptText;
	}
	
	public static void main (String[]args)
	{
	      String text = "abc";
	      int shift = 50;
	      System.out.println(text + " encrypted is " + encrypt(text,shift));
	      //System.out.print(decrypt("yza", 50));

	 }
}
