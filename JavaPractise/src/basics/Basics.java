public class Basics {

  public static void main(String[] args) {
    // basic datatypes and some operations
    int n1 = 5, n2 = 10;
    String firstName = "Vinay", lastName = "Sahrawat";
    System.out.println(n1 + n2 + "ggwp");
    System.out.println("ggwp" + n1 + n2);
    System.out.println(firstName + " " + lastName);

    /*
        The general rules for naming variables are:
        Names can contain letters, digits, underscores, and dollar signs
        Names must begin with a letter
        Names should start with a lowercase letter and it cannot contain whitespace
        Names can also begin with $ and _ (but we will not use it in this tutorial)
        Names are case sensitive ("myVar" and "myvar" are different variables)
        Reserved words (like Java keywords, such as int or boolean) cannot be used as names
    */

    // Primitive data types - includes byte, short, int, long, float, double, boolean and char
    // A primitive data type specifies the size and type of variable values, and it has no additional methods.
    int myNum = 5; // Integer (whole number)
    float myFloatNum = 5.99f; // Floating point number
    char myLetter = 'D'; // Character
    boolean myBool = true; // Boolean
    String myText = "Hello"; // String
    byte b = 0; //byte data type can store whole numbers from -128 to 127
    boolean isFishTasty = false; //only true and false, not 1 and 0
    System.out.println(isFishTasty);
    /*
        The main difference between primitive and non-primitive data types are:
        Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String).
        Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
        A primitive type has always a value, while non-primitive types can be null.
        A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
        Examples of non-primitive types are Strings, Arrays, Classes, Interface, etc.
    */

    /*
        Java Type Casting
        Type casting is when you assign a value of one primitive data type to another type.
        In Java, there are two types of casting:
        Widening Casting (automatically) - converting a smaller type to a larger type size
        byte -> short -> char -> int -> long -> float -> double
        Narrowing Casting (manually) - converting a larger type to a smaller size type
        double -> float -> long -> int -> char -> short -> byte
    */
    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double
    System.out.println(myInt); // Outputs 9
    System.out.println(myDouble); // Outputs 9.0

    double dblNum = 9.78d;
    int intNum = (int) dblNum; // Manual casting: double to int
    System.out.println(dblNum); // Outputs 9.78
    System.out.println(intNum); // Outputs 9

    //operators I already know, so only including important topics
    //<< left shift operator 3<<2, shift every bit to left 2 times, >> right shift, &&, ||, !=, ==

    String txt = "Hello World";
    System.out.println(txt.length()); //11
    System.out.println(txt.toUpperCase()); // Outputs "HELLO WORLD"
    System.out.println(txt.toLowerCase()); // Outputs "hello world"
    System.out.println(txt.indexOf("locate")); // -1
    System.out.println(txt.indexOf("World")); // 6

    System.out.println(Math.max(n1, n2));

    //if else basic example
    if (n1 > n2) System.out.println("n1 is greater"); else System.out.println(
      "n2 is greater"
    );
    String result = (n1 > n2) ? "n1 is greater" : "n2 is greater";
    System.out.println("Ternary result: " + result);

    //switch case example
    int day = 4;
    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
      default:
        System.out.println("Invalid Day!");
    }

    //while and do while loops example
    System.out.println("While loop example");
    int i = 0;
    while (i < 5) {
      System.out.println(i);
      i++;
    }

    //do while will execute the loop atleast once before checking the conditions
    System.out.println("Do While loop example");
    i = 0;
    do {
      System.out.println(i);
      i++;
    } while (i < 5);

    //for and foreach example
    System.out.println("For loop example");
    for (i = 0; i <= 10; i = i + 2) {
      System.out.println(i);
    }

    //foreach loop example
    String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
    for (String s : cars) {
      System.out.println(s);
    }
  }
}
