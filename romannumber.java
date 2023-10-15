import java.util.Scanner;

class romannumber
   {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase();
        int integerValue = 0;
        int prevValue = 0;
        int z=romanNumeral.length();

        for (int i=z-1;i>=0;i--) 
          {
            char romanChar = romanNumeral.charAt(i);
            int value = 0;

            switch (romanChar)
            {
                case 'I':
                    value = 1;
                    break;
                case 'V':
                    value = 5;
                    break;
                case 'X':
                    value = 10;
                    break;
                case 'L':
                    value = 50;
                    break;
                case 'C':
                    value = 100;
                    break;
                case 'D':
                    value = 500;
                    break;
                case 'M':
                    value = 1000;
                    break;
                default:
                    System.out.println("Invalid Roman numeral");
                    return;
            }

            if (value < prevValue) 
            {
                integerValue -= value;
            } 
            else
            {
                integerValue += value;
            }

            prevValue = value;
        }

        System.out.println("Integer value: " + integerValue);
    }
}
