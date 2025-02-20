package problemsetone;

import java.util.Scanner;

public class LCMandHCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        int hcf = hcf(num1, num2);
        int lcm = lcm(num1, num2);
        System.out.println("hcf : " + hcf);
        System.out.println("lcm : " + lcm);
    }

    public static int hcf(int a, int b) {
        if (b == 0)
            return a;
        return hcf(b, a % b);
    }

    public static int lcm(int a, int b) {
        return (a * b) / hcf(a, b);
    }
}
