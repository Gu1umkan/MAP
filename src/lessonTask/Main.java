package lessonTask;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] languages = new String[]{"Java", "C#", "Go", "PHP", "Java", "C#", "Java"};
        System.out.println(map(languages));
    }

    public static Map<String, Integer> map(String[] languages) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < languages.length; i++) {
            if (!map.containsKey(languages[i]))
                map.put(languages[i], 1);
            else map.put(languages[i], map.get(languages[i]) + 1);
        }
        return map;
    }
}