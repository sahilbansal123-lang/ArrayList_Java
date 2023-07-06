package ArrayList;
import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.set(2, 6);
        System.out.println(list);
        System.out.println(list.get(3));
        list.remove(4);
        System.out.println(list);
        System.out.println(list.contains(10));
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        list.add(6);

        // find Min and Max int array list
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max){
                max = list.get(i);
                System.out.println("max element is: " + max);
            }

        }

        // Swaping two elements in array list


    }
}