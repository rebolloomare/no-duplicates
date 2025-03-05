package omare.com.mx;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static String returnString(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        Set<Character> set = new LinkedHashSet<>();
        StringBuilder builder = new StringBuilder();
        for(char c : input.toCharArray()) {
            if(set.add(c)){
                builder.append(c);
            }
        }
        return builder.toString();
    }
}