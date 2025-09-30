import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Give two words");
    String word1 = scan.nextLine();
    String word2 = scan.nextLine();

    System.out.println("Give a number");
    int N = scan.nextInt();
    lastFirstN(word1, word2, N);

    System.out.println(removeStr("Chau", "au"));
    }

  /** Precondition: s1 and s2 are not null
  * Precondition: 0 <= n <= min(s1.length(), s2.length()
  */
  public static void lastFirstN(String s1, String s2, int n)
  {
    String output;
    String firstN;
    String lastN;

    // substring(0, 1) - 1st letter
    // substring(0, 2) - 1st 2 letters
    // substring(0,3) - 1st 3 letters
    // ...
    // substring(0, n) - 1st n letters

    firstN = s2.substring(0, n);

    // last n characters of s1
    // start at index lenght() - n gives the last n characters
    lastN = s1.substring( s1.length() - n);

    output = lastN + firstN;
    System.out.println(output);
  }

  /** Precondition: s1 and s2 are not null
  */
  public static void stringManip(String s1, String s2)
  {
    String output;
    String oneCap;
    String allCap;

    oneCap = s1.substring(0, 1).toUpperCase();
    oneCap += s2.substring(1, s2.length()).toLowerCase();
    allCap = s2.toUpperCase();

    output = oneCap + allCap;
    System.out.println(output);
  }

  /** Precondition: s1 and s2 are not null
  * Precondition: s2 is a substring of s1 and can be found at least one time in s1
  */
  public static String removeStr(String s1, String s2)
  {
    String output = null;
    String before;
    String after;

    int inexOfs2 = s2.indexOf(s2);
    int indexOfEnds2 = indexOfs2 + s2.length();

    before = s1.substring(0, indexOfs2);
    after = s1.substring(indexOfEnds2);

    output = before + after;
    return output;
  }
}
