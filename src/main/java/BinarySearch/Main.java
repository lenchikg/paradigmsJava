package main.java.BinarySearch;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;

        int result = BinarySearch.binarySearch(array, target);

        if (result != -1) {
            System.out.println("Элемент " + target + " найден по индексу " + result);
        } else {
            System.out.println("Элемент " + target + " не найден в массиве.");
        }
    }
}