import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> namesAndLanguages = new HashMap<>();
        namesAndLanguages.put("Rust", "Andrey");
        namesAndLanguages.put("Java", "Tatyana");
        namesAndLanguages.put("JavaScript", "Anna");
        namesAndLanguages.put("Python", "Alex");
        for (Map.Entry<String, String> element : namesAndLanguages.entrySet()) {
            System.out.println(element);
        }
        Set<String> languages = namesAndLanguages.keySet();
        System.out.println("keys - programming languages: " + languages);

        ArrayList<String> names = new ArrayList<>(namesAndLanguages.values());
        System.out.println("Programists: " + names);
    }
}