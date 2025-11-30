import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Task1_ManualIterator {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println("Using Iterator:");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("\nUsing For-each:");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("\nUsing ListIterator (reverse):");
        ListIterator<String> litr = list.listIterator(list.size());
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }
    }
}