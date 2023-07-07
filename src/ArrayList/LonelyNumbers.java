package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class LonelyNumbers {

    public static ArrayList<Integer> lonelyNumbers(ArrayList<Integer> list) {
        Collections.sort(list);
        ArrayList<Integer> sol = new ArrayList<>();
        for (int i = 1; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i - 1) + 1 && list.get(i + 1) > list.get(i) + 1 ) {
                sol.add(list.get(i));
            }
        }
        if (list.size() == 1) {
            sol.add(list.get(0));
        }
        if (list.size() > 1) {
            // check for 0th element to be lonely
            if (list.get(0) + 1 < list.get(1)){
                sol.add(list.get(0));
            }

            // check for last element to be lonely
            if (list.get(list.size() - 2) + 1 < list.get(list.size() - 1)) {
                sol.add(list.get(list.size() - 1));
            }
        }
        return sol;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        System.out.println(lonelyNumbers(list));
    }

}
