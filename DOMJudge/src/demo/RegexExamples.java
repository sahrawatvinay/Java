package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("x|z");
	    Matcher matcher = pattern.matcher("rege Visit W3Shools rege");
	    boolean matchFound = matcher.find();
	    System.out.println(matchFound);
	}

}
