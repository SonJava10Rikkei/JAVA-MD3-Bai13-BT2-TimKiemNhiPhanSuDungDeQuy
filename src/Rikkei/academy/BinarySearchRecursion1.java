package Rikkei.academy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BinarySearchRecursion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(5);
        arr.add(8);
        arr.add(2);
        arr.add(4);
        arr.add(9);
        arr.add(10);
        arr.add(7);
        arr.add(15);
        arr.add(13);
        System.out.println("Before sort--> " + arr);
        Collections.sort(arr);
        System.out.println("Sorted--> " + arr);
        System.out.println("Enter a number: ");
        int target = sc.nextInt();
        System.out.println(new BinarySearchRecursion1().binarySearch(arr, target) ? "Was found!" : "Was not found");
    }

    public boolean binarySearch(ArrayList<Integer> array, int value) {
        return binarySearchRecursion(array, 0, array.size() - 1, value);
    }

    boolean binarySearchRecursion(ArrayList<Integer> array, int left, int right, int value) {
        int mid = (right + left) / 2;
        while (right >= left)
            if (array.get(mid) == value) {
                return true;
            } else if (array.get(mid) > value) {
                right = mid - 1;
                return binarySearchRecursion(array, left, right, value);
            } else {
                left = mid + 1;
                return binarySearchRecursion(array, left, right, value);
            }
        return false;
    }
}