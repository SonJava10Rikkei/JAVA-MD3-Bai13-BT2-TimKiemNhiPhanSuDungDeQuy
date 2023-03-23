
import config.Config;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(5);
        array.add(8);
        array.add(2);
        array.add(4);
        array.add(9);
        array.add(10);
        array.add(7);
        array.add(15);
        array.add(14);
        System.out.println("Mảng ban đầu--> " + array);
        Collections.sort(array);
        System.out.println("Mảng sau khi sắp xếp--> " + array);
        System.out.println("Nhập số cần tìm kiếm trong manng đã sắp xếm: ");
        int value = Config.scanner().nextInt();
        int result = binarySearch(array, 0, array.size() - 1, value);
        if (result == -1) {
            System.out.println("Không tìm thấy giá trị " + value + " trong mảng");
        } else {
            System.out.println("Giá trị " + value + " được tìm thấy tại vị trí " + result);
        }

    }

    public static int binarySearch(ArrayList<Integer> array, int left, int right, int value) {
        if (right >= left) {
            // Khai báo biến middle và gán giá trị cho nó bằng trung bình cộng của left và right
            int middle = left + (right - left) / 2;

            // Nếu array[middle] = value thì return về middle
            if (array.get(middle) == value) {
                return middle;
            }

            // value lớn hơn phần tử ở middle, nên ta tìm kiếm phía bên phải của middle
            if (array.get(middle) < value) {
                return binarySearch(array, middle + 1, right, value);
            }

            // value nhỏ hơn phần tử ở middle, nên ta tìm kiếm phía bên trái của middle
            return binarySearch(array, left, middle - 1, value);
        }
        return -1;
    }

}