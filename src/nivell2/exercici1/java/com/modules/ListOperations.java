package nivell2.exercici1.java.com.modules;

import java.util.List;

public class ListOperations {

    public static List<String> filteredList (List<String> inList){
        return inList.stream()
                .filter(elem -> elem.length() == 3 && elem.startsWith("A"))
                .toList();
    }



}
