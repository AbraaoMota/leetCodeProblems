package longSubStrNoRepeats; /**
 * Created by Abraao Mota on 01/12/2015.
 */

import java.util.LinkedList;
import java.util.List;

public class Main
{
  public static void main(String[] args)
  {

    String s = "Hello";
    String s1 = "aab";
    String s2 = "";
    String s3 = "abcdefghijkl";
    String s4 = "abaro";

    Main main = new Main();

    System.out.println(main.lengthOfLongestSubstring(s));
    System.out.println(main.lengthOfLongestSubstring(s1));
    System.out.println(main.lengthOfLongestSubstring(s2));
    System.out.println(main.lengthOfLongestSubstring(s3));
    System.out.println(main.lengthOfLongestSubstring(s4));


  }

  public int lengthOfLongestSubstring(String s)
  {
    List<Integer> subStringsForAllChars = new LinkedList<>();
    for (int i = 0; i < s.length(); i++) {
      List<Character> charsSeen = new LinkedList<>();
      charsSeen.add(s.charAt(i));
      int count = 0;
      int charsBackNotRepeated = checkBackwards(s, s.charAt(i), charsSeen);
      int charsForthNotRepeated = checkForwards(s, s.charAt(i), charsSeen);

      count += lengthOfLongestSubstring(s.substring(i - charsBackNotRepeated, i + charsForthNotRepeated));

      subStringsForAllChars.add(count);
    }
    int maxSubstr = 0;
    for (Integer i : subStringsForAllChars) {
      if (i > maxSubstr) {
        maxSubstr = i;
      }
    }
    return maxSubstr;
  }

  private int checkBackwards(String string, char currentChar, List<Character> charsSeen)
  {
    //Character to start checking has index i in the string
    int i = string.indexOf(currentChar);
    int count = 0;
    if (i != 0) {
      for (int j = i - 1; j >= 0; j++) {
        if (charsSeen.contains(string.charAt(j))) {
          return count;
        } else {
          charsSeen.add(string.charAt(j));
          count++;
        }
      }
    }
    return count;
  }


  private int checkForwards(String string, char currentChar, List<Character> charsSeen)
  {
    //first character (this character has index i in the string)
    int i = string.indexOf(currentChar);
    int count = 0;
    for (int j = i + 1; j < string.length(); j++) {
      if (charsSeen.contains(string.charAt(j))) {
        return count;
      } else {
        charsSeen.add(string.charAt(j));
        count++;
      }
    }
    return count;
  }
}

