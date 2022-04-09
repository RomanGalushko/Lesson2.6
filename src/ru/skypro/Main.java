package ru.skypro;

import java.util.*;

public class Main {

    static List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    static List<String> text = new ArrayList<>(List.of("1", "1", "2", "3", "4", "4", "5", "5", "6", "7"));

    //    task 1
    public static void printOddNums() {
        if (nums.isEmpty()) {
            System.out.println("Список пуст");
        } else {
            for (Integer num : nums) {
                if (num % 2 != 0) {
                    System.out.print(num + " ");
                }
            }
        }
        System.out.println();
    }

    //    task 2
    public static void printEvenNums() {
        if (nums.isEmpty()) {
            System.out.println("Список пуст");
        } else {
            nums.sort(Comparator.naturalOrder());
            nums = new ArrayList<>(new HashSet<>(nums));
            for (Integer num : nums) {
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                }
            }
        }
        System.out.println();
    }

    //    task 3
    public static void printUniqueWords() {
        if (text.isEmpty()) {
            System.out.println("Список пуст");
        } else {
            Set<String> uniqueWords = new HashSet<>(text);
            System.out.println(uniqueWords);
        }
    }

    //    task 4
    public static void printReplayWords() {
        if (text.isEmpty()) {
            System.out.println("Список пуст");
        } else {
            Set<String> uniqueWords = new HashSet<>(text);
            System.out.println(text.size() - uniqueWords.size());
        }
    }

    public static void main(String[] args) {
        System.out.println("task 1");
        printOddNums();
        System.out.println("task 2");
        printEvenNums();
        System.out.println("task 3");
        printUniqueWords();
        System.out.println("task 4");
        printReplayWords();
    }
}