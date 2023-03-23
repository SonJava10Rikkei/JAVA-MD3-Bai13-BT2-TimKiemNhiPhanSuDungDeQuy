import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        System.out.println("Nhập số để lưu vào mảng");

        int[] array = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        Arrays.sort(array);
        int value = 11;
        int result = binarySearch(array, 0, array.length - 1, value);
        if (result == -1) {
            System.out.println("Không tìm thấy giá trị " + value + " trong mảng");
        } else {
            System.out.println("Giá trị " + value + " được tìm thấy tại vị trí " + result);
        }
    }
    public static int binarySearch(int[] array, int left, int right, int value) {
        if (right >= left) {
            // Khai báo biến middle và gán giá trị cho nó bằng trung bình cộng của left và right
            int middle = left + (right - left) / 2;

            // Nếu array[middle] = value thì return về middle
            if (array[middle] == value) {
                return middle;
            }

            // value lớn hơn phần tử ở middle, nên ta tìm kiếm phía bên phải của middle
            if (array[middle] < value) {
                return binarySearch(array, middle + 1, right, value);
            }

            // value nhỏ hơn phần tử ở middle, nên ta tìm kiếm phía bên trái của middle
            return binarySearch(array, left, middle - 1, value);
        }

        // Nếu không tìm thấy giá trị trong mảng, trả về -1
        return -1;
    }

}