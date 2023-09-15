import java.util.*;

public class StringsBasics {
// Strings are immutable
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String strFirstName = "Vinay";
    String strNickName = "Vinahy";
    System.out.println("Enter Last Name and characterisic");
    String strLastName = sc.nextLine();

    String strCombined = strFirstName + " " + strLastName;
    System.out.println(
      "The length of combined string is: "+
      strCombined.length()
    );

    //comparing 2 strings
    //1 s1 > s2 returns +ve value
    //2 s1 == s2 returns 0
    //3 s1 < s2 returns -ve value
    //start index se compare hota pehle dis similar character check hota hai on the basis of a to z me kaha aati hai value jo baad me aata hai wo badahai
     if(strFirstName.compareTo(strNickName) == 0)
        System.out.println("These are similar");
     else
        System.out.println("Dis similar");

    //str1.equals(str2) : The equals method compares the content of two strings, checking if they have the same sequence of characters
    //str1.equalsIgnoreCase(str2) : The equalsIgnoreCase method performs a case-insensitive comparison of two strings.

    String sentence = "My name is Vinay";
    String name = sentence.substring(12, sentence.length()); //end is exclusive, matlab is se pichle wala, end na bhi daalein toh wo us index se last tak print kar dega
    sentence = "GGWP";
    int intNumber = 6;
    intNumber = 69;
    System.out.println(sentence);
    System.out.println(intNumber);
  }
}
