import java.util.*;

public class UserInputs {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nNumber = sc.nextInt();
    float fNumber = sc.nextFloat();
    double dNumber = sc.nextDouble();
    String strNameNext = sc.next(); // if we input a string here eg "Vinay Sahrawat", it will only read upto space, not after that ie. "Vinay" only
    String strFullNameNextline = sc.nextLine(); // takes the whole string as an input
    char cAlphabet = sc.next().charAt(0);
    // there is no method available for scanner to input character,
    // so we need to use charAt method of string and since it belongs to string,
    // we can not access it by using scanner class, so we need to use next()
    String bBooleanInput = sc.next();
    boolean bBoolean = Boolean.parseBoolean(bBooleanInput);
    System.out.println("Enter the size of an array: ");
    int nSize = sc.nextInt();
    int arrArray[] = new int[nSize];
    System.out.println("Enter the elements: ");
    for (int i = 0; i < nSize; i++) {
      arrArray[i] = sc.nextInt();
    }
    System.out.println("You have entered the below values: ");
    System.out.println(
      nNumber +
      " " +
      fNumber +
      " " +
      dNumber +
      " " +
      strNameNext +
      " " +
      strFullNameNextline +
      " " +
      cAlphabet +
      " " +
      bBooleanInput +
      " " +
      bBoolean
    );
    for (int i = 0; i < arrArray.length; i++) {
      System.out.print(arrArray[i] + " ");
    }
    sc.close();
  }
}
