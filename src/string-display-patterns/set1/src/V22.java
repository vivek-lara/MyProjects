class V22 
{
	public static void main(String[] args) 
	{
		String s1 = "ABC DEGH IJKLMN";
		int i = s1.length() - 10;
		while (i <= s1.length()-1)
		{
			System.out.print(s1.charAt(i));
			i++;
		}
	}
}
