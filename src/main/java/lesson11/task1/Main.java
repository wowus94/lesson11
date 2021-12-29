package lesson11.task1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(list1);
        listSwap1stAndLast(list1);
        System.out.println(list1);

        List<String> list2 = Arrays.asList("Hello", "Geekbrains", "Java");
        System.out.println(list2);
        listSwap1stAndLast(list2);
        System.out.println(list2);
    }

    public static <T> List<T> listSwap1stAndLast(List<T> list) {
        List<T> tempList = list;
        T firstElement = tempList.get(0);
        T lastElement = tempList.get(list.size() - 1);
        tempList.set(0, lastElement);
        tempList.set(tempList.size() - 1, firstElement);
        return tempList;
    }
}