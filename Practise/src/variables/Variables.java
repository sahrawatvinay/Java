package variables;

import java.util.Scanner;

/// no limit on name length of variable, but as per convention max 15
public class Variables {
    public static void main(String[] args) {
        int z; //declaration
        z = 619; //initialization
        int x = 69; // x is identifier here, 69 is integer literal here
        float f = 5; //5.0
        //float ff = 5.0; //error it thinks that 5.0 is large and treats it as double
        float ff = 5.0f; //to specify that 5.0 will fit in float, we add f or F
        boolean isNew = true;
        char myCharacter = 'k';
        String myString = "Good Morning";
        System.out.println("x : " + x + " f : " + f + " ff : " + ff + " boolean : " + isNew + " z : " + z);
        System.out.println("character: " + myCharacter + " myString: " + myString);

        //user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = sc.nextLine();
        System.out.println(name + ", also enter your age");
        int age = sc.nextInt();
        System.out.println("Hello, Good Morning " + name + ", you are " + age + " years old.");
        sc.close();

        //type casting, conversion
        //implicit
        long big = 45;
        float dec = 3;
        double d = 3.4f;
        //explicit
        float eDec = (float) 3.4;
        long eBig = (long) 3.4;
        int eInt = (int) 3.4;
    }
}
