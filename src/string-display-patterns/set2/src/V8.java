class V8
{
	public static void main(String[] args) 
	{
		String s1 = "ABC XYZ TEST HELLO";
		int j = s1.indexOf(' ');
		int i =  s1.indexOf(' ' , j+1);
		String s2 = s1.substring( j+1, i  );
		System.out.println(s2.length());
	}
}
