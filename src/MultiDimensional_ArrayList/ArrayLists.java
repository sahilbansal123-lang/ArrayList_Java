package MultiDimensional_ArrayList;

import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
//        list1.add(1);
//        list1.add(3);
//        list1.add(2);
        ArrayList<Integer> list2 = new ArrayList<>();
//        list2.add(4);
//        list2.add(5);
//        list2.add(6);
        ArrayList<Integer> list3 = new ArrayList<>();
//        list3.add(7);
//        list3.add(8);
//        list3.add(9);
//        mainList.add(list1);
//        mainList.add(list2);
//        mainList.add(list3);
//        System.out.println(mainList);


        for (int i = 1; i <= 5; i++) {
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        System.out.println(mainList);

        // nested loops
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
    }
}