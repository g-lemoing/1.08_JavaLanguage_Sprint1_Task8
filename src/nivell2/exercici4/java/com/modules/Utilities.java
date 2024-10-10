package nivell2.exercici4.java.com.modules;

import java.util.List;

public class Utilities {
    public static List<String> sortFirstChar(List<String> inList){
        return inList.stream().sorted((s1, s2) -> s1.charAt(0) - s2.charAt(0)).toList();
    }

    public static List<String> sortFirstContains_e(List<String> inList){
        return inList.stream().sorted((s1, s2) -> {
            if(s1.contains("e") && !s2.contains("e")) {
                return -1;
            }
            else if(!s1.contains("e") && s2.contains("e")){
                return 1;
            }
            else return 0;
        }).toList();
    }

    public static List<String> replaceElemWith_a(List<String> inList){
        return inList.stream()
                .map(s -> s.contains("a")? s.replace('a', '4') : s)
                .toList();
    }

    public static List<String> filterNumbers(List<String> inList){
        return inList.stream().filter(s -> s.chars().allMatch(Character::isDigit)).toList();
    }
}
