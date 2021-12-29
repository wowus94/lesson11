package lesson11.task2;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] words = {"Стол", "Стул", "Ноутбук", "Окно",};

        List<String> wordList = Arrays.asList(words);

        for (String e : wordList) {
            System.out.println(e);

        }
    }
}