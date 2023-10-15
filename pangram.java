import java.util.Scanner;
class pangram
 {
   public static void main(String[] args)      
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input: ");
        String input=sc.nextLine();
        boolean isPangram = checkPangram(input);
        if (isPangram) 
          {
            System.out.println("The input is a pangram.");
          } 
	  else
	  {
            System.out.println("The input is not a pangram.");
          }
    }

    public static boolean checkPangram(String input) 
    {
        boolean[] alphabetOccurrence = new boolean[26];
        int totalAlphabets=26;
        int count=0;
        int e=input.length();
        for (int i=0;i<e;i++) 
	{
            char ch = input.charAt(i);
            if ('A' <= ch && ch <= 'Z')
	    {
                ch = (char) (ch - 'A' + 'a'); // Convert to lowercase
            }
            if ('a' <= ch && ch <= 'z' && !alphabetOccurrence[ch - 'a'])
	    {
                alphabetOccurrence[ch - 'a'] = true;
                count++;
                if (count == totalAlphabets) 
		{
                    return true;
                }
            }
        }

        return false;
    }
}
