package pod2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IdenticalWords {
	 private static String findWordWithMinimumChanges(String[] words, int M) {
	        Map<Character, Integer>[] charCounts = new HashMap[M];
	        for (int i = 0; i < M; i++) {
	            charCounts[i] = new HashMap<>();
	        }

	        for (String word : words) {
	            for (int i = 0; i < M; i++) {
	                char c = word.charAt(i);
	                charCounts[i].put(c, charCounts[i].getOrDefault(c, 0) + 1);
	            }
	        }

	        StringBuilder resultBuilder = new StringBuilder();
	        for (int i = 0; i < M; i++) {
	            char minChar = 'a';
	            int minCount = Integer.MAX_VALUE;

	            for (char c = 'a'; c <= 'e'; c++) {
	                int count = charCounts[i].getOrDefault(c, 0);
	                if (count < minCount) {
	                    minCount = count;
	                    minChar = c;
	                }
	            }

	            resultBuilder.append(minChar);
	        }

	        return resultBuilder.toString();
	    }

	    private static int countMinimumChanges(String[] words, String target) {
	        int changes = 0;
	        for (String word : words) {
	            for (int i = 0; i < word.length(); i++) {
	                if (word.charAt(i) != target.charAt(i)) {
	                    changes++;
	                }
	            }
	        }
	        return changes;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        String[] words = new String[N];
        for (int i = 0; i < N; i++) {
            words[i] = scanner.nextLine();
        }

        String result = findWordWithMinimumChanges(words, M);
        int minChanges = countMinimumChanges(words, result);

        System.out.println(result);
        System.out.println(minChanges);

        scanner.close();
	}

}
