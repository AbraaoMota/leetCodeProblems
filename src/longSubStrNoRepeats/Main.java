package longSubStrNoRepeats; /**
 * Created by Abraao Mota on 01/12/2015.
 */
import java.util.*;
public class Main {
  public static void main(String[] args) {

    String s = "Hello";
    String s1 = "aab";
    String s2 = "";
    String s3 = "abcdefghijkl";

    System.out.println(lengthOfLongestSubstring(s));
    System.out.println(lengthOfLongestSubstring(s1));
    System.out.println(lengthOfLongestSubstring(s2));
    System.out.println(lengthOfLongestSubstring(s3));

  }

  /*

  Have an array which goes through the string given and places each char seen in a charSeen array

  charSeen = A B C D E F G H J I K L M N O P Q R S T V ..
             0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
  Stores How many times seen, and index of string where it was seen
        A
       (0, 1)

       "HELLO"


      Map (Char, List<Integer>)
      Maps the character to a list of indices where it was seen in a string
       H -> (seen 1 time, seen at index 0) -> (0, 0)
       E -> (seen 1 time, ind 1)           -> (0, 1)
       L -> (seen 2 times.                 -> (0, 2), (2, 3)
       O -> (seen 1 time)                  -> (0, 4)

       Once the map is produced, you loop through each element
       If an element has a list of ints with size greater than 1


       calculate largest substring
       A method that given a list of indices and a an integer for the size of a string, can calculate the largest non repeating substr.

       Map<Char,

                2  3   4      6
       H    e   l  l   o   W  o  r  l  d

       9













      H   E   L   L   O

      array with length as the string -> stores the largest substring at any given index

      int[] maxSubStringAtIndex = new int[string.length);

      for the string hello, array should be
      [3, 3, 3, 2, 2]

      int i = 0;
      for (i = 0; i < string.length; i++)
      {
        // Each character needs a List of characters. If any character already encountered
        List<Char> charsSeen = new LinkedList<Char>();
        charsSeen.add(string[i]);


        int temp = i - 1;
        // Check behind the character
        while (temp >= 0) {
          char c = string[temp];
          if (charsSeen.contains(c)) {
            break;
          } else {
            charsSeen.add(c);
          }


          temp--;
        }

        // Check ahead of the character
        while (there is a valid character ahead of the current one) {

        }



        add the length of longest substr to maxSubStringAtIndex;
      }







      check backwards
      given an index and a string, check back to




      check forwards
















   */


  //private static




  private static int lengthOfLongestSubstring(String s) {
    return 0;
  }
  /*
  private static Map<Character, Boolean> charSeen = new HashMap<Character, Boolean>();




  private static void initCharSeen() {
    for (int i = 0; i < 26; i++) {
      char c = 'a';
      c += i;
      charSeen.put(c, false);
    }
  }

  public static int lengthOfLongestSubstring(String s) {
    initCharSeen();
    int count = 0;
    boolean isGtzero = false;
    for (char c : s.toCharArray()) {
      isGtzero = true;
      if (charSeen.get(c) == null) {
        charSeen.put(c, false);
        count++;
      }
      else if (!charSeen.get(c)) {
        charSeen.put(c, true);
        count++;
      }
      else {
        return count;
      }
    }
    if (!isGtzero) {
      return count++;
    }
    return count;

  }

  */





}

