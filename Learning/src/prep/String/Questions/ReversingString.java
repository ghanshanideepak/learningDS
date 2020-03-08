package prep.String.Questions;

public class ReversingString {

	public static void main(String[] args) {
		
		/*/// Using toCharArray()
		String s1 = "abcd";
		char[] charAr = s1.toCharArray();
		
		char[] temp = new char[s1.length()];
		for(int i =s1.length()-1;i>=0;i--)
		{
			
			System.out.print( charAr[i]);
		}
		
		
		//Using Builder Class
		StringBuilder strBuild = new StringBuilder();
		strBuild.append(s1);
		
		System.out.println("String Builder Reverse " + strBuild.reverse());
		
		
		//Using ByteArray
		byte[] byteArray = s1.getBytes();
		
		byte[] resultArray = new byte[byteArray.length];
		
		for (int i=0;i<byteArray.length;i++)
		{
			resultArray[i] = byteArray[byteArray.length-i-1];
			
		}
		
		System.out.println("Using Bytes " + new String(resultArray));*/
		
		/*String s1 = "Hello";
		String s2 = new String("Hello");
		s2= s2.intern();
		String s3= "Hello";
		
		Integer i =1;
		
		
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		
		*/
		
		deleteODD(args[0]);
		

	}
	
	public static  void deleteODD (String s)
	{
		char[] temp = s.toCharArray();
		String result ="";
		
		for(int i=0;i<s.length();i++)
		{
			
			if(i==0 || i%2==0)
			{
				result = result+s.charAt(i);
			}
		}
		
		System.out.println(result);
	}

}
