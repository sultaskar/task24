import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static Set<String> removeEvenLength(Set<String> set){
        Set<String> evenSet = new LinkedHashSet<String>();
        Iterator<String> it = set.iterator();
        for(String string: set){
            if ((string.length()) % 2 != 0){
                evenSet.add(string);
            }
        }
        return evenSet;
    }

    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<String>();
        set.add("odd");
        set.add("even");
        set.add("!");
        set.add("phone");
        set.add("television");
        set.add("me");
        set.add("pool");

        System.out.println(removeEvenLength(set));

    }
}
