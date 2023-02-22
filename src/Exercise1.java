import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;
public class Exercise1 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(4);
        set.add(7);
        set.add(5);
        set.add(3);
        set.add(4);
        set.add(5);

        System.out.println(set);
        set = increment(set);
        System.out.println(set);
        String [] array = {"Hello","Bye","Hello","Exit","Tree","Tree"};
        printUnique(array);
        printUnique("AAAAAAA","BBBBBB","AAAAAAAA","CCCCCCC");
        System.out.println(set);
        System.out.println("-----------");
        printDuplicates(array);
        Set<String> set1 = new HashSet<>();
        set.add("A");
        set.add("C");
        set.add("B");
        Set<String> set2 =new HashSet<>();
        set.add("A");
        set.add("D");
        set.add("B");
    }


    public static Set<Integer> increment(Set<Integer> set) {
        Set<Integer> newSet = new HashSet<Integer>();
        for (Integer i : set) {
            newSet.add(i+1);
        }
        return newSet;
    }

    public static void printUnique(String ... array) {
        List<String> list = Arrays.asList(array);
        Set<String> set = new HashSet<>(list);
        System.out.println(set);
    }
    public static void printDuplicates(String ... array) {
        List<String> list = new ArrayList<>(Arrays.asList(array));
        Set<String> set = new HashSet<>(list);
        for (String s : set) {
            list.remove(s);
        }
        Set<String> result = new HashSet<>(list);
        System.out.println(result);
    }

    public static <T> void printIntersection(Set<T> set1, Set<T> set2) {


    }

}
