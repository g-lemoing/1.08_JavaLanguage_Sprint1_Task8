package nivell2.exercici2.java.com.modules;

import java.util.List;
import java.util.stream.Collectors;

public class Utilities {
    public static String getOddEven1(List<Integer> inList){
        return inList.stream()
                .map(elem -> elem%2 == 0 ? "e" + String.valueOf(elem) : "o" + String.valueOf(elem) )
                .collect(Collectors.joining(", ", "'", "'"));
    }
}
