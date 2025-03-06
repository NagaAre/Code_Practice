public class LetterCombo {
    static String[] keypad = {" ", " ", "abc", "def", "ghi","jkl","mno","pqrs","tuv","wxyz"};
    static int count = 1;// here static keyword is used because to avoid the object/creating the instance variable
    static void possibleWords(String s, String ans)
      {
        int i;
        if(s.length() == 0)
        {
            System.out.println(count + ": " + ans);
            count++; 
            return;

        }

           String k = keypad[s.charAt(0) - 48];
           for( i = 0; i<k.length(); i++)
         {
          possibleWords(s.substring(1), ans+ k.charAt(i));
          }

      }
        
      public static void main(String[] args) {
        String input = "24"; // Example input
        possibleWords(input, "");

    }

}
