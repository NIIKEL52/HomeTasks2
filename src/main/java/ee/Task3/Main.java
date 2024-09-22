package ee.Task3;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String text = "Как же я хочу в зоопарк, потому что Денис уже там был.";
        System.out.println(containsAllLetters(text));
    }

    public static boolean containsAllLetters(String text) {
        Set<Character> alphabet = new HashSet<>();
        for (char c = 'а'; c <= 'я'; c++) {
            alphabet.add(c);
        }
        alphabet.add('ё');

        for (char c : text.toLowerCase().toCharArray()) {
            alphabet.remove(c);
        }

        return alphabet.isEmpty();
    }
}
