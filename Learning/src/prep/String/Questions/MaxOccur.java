package prep.String.Questions;

public class MaxOccur {
	
	
	static final int ASCII_SIZE = 256;
    static char getMaxOccuringChar(String str)
    {
        // Create array to keep the count of individual
        // characters and initialize the array as 0
        int count[] = new int[ASCII_SIZE];
      
        // Construct character count array from the input
        // string.
        int len = str.length();
        for (int i=0; i<len; i++)
        {
        	System.out.println(str.charAt(i));
            count[str.charAt(i)]++;
        }
        int max = -1;  // Initialize max count
        char result = ' ';   // Initialize result
      
        // Traversing through the string and maintaining
        // the count of each character
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
      
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "test";
		System.out.println("Result" + getMaxOccuringChar(s));
		/*char[] charAr  = s.toCharArray();
		
		for(char c:charAr)
		{
			int hashTemp = c;
			System.out.println("HashCOde" + hashTemp);
			
			
		}*/

	}

}
