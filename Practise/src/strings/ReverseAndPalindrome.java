package strings;

public class ReverseAndPalindrome {
    public static void main(String[] args) {
        String s1 = "oyo";
        char[] ch = s1.toCharArray();
        int s = 0;
        int e = s1.length() - 1;
        while(s < e){
            char x = ch[s];
            ch[s] = ch[e];
            ch[e] = x;
            s++;
            e--;
        }
        String reverse = new String(ch);
        String ezReverse = new StringBuilder(s1).reverse().toString();
        System.out.println(reverse + " ------- " + ezReverse);
        System.out.println("is palindrome: " + s1.equals(ezReverse));
    }
}
