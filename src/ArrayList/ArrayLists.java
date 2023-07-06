package ArrayList;
import java.util.ArrayList;

public class ArrayLists {

    public static void swap(ArrayList<Integer> list1, int idx1, int idx2){
        int temp = list1.get(idx1);
        list1.set(idx1, list1.get(idx2));
        list1.set(idx2, temp);
    }


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
        list.add(7);

        // find Min and Max int array list
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {

//            if (list.get(i) > max){
//                max = list.get(i);
//            }

//            if (list.get(i) < min){
//                min = list.get(i);
//            }
            max = Math.max(list.get(i), max);
            min = Math.min(list.get(i), min);
        }
        System.out.println("max element is: " + max);
        System.out.println("Min element is: " + min);

        System.out.println(list);
        // Swaping two elements in array list
        swap(list, 2, 5);
        System.out.println(list);

    }
}