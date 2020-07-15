package bubble_sorter;

import util.DataGenerator;

import java.util.Arrays;

import static util.Printer.print;

/**
 *  冒泡排序
 *  思想： 两两比较，一直到数组尾部，类似与冒泡泡
 *  比较出 最大/最小 放在末尾
 *  时间复杂度 O(n²)
 *  空间复杂度 O(1)
 *
 *  稳定的
 */
public class BubbleSorter {


    /**
     *  从小到大
     * @param arr
     * @return
     */
    public static int[] sort(int[] arr){
        int[] clone = arr.clone();
        for (int i = clone.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (clone[j] > clone[j+1]){
                    swap(clone, j, j+1);
                    print(clone);
                    System.out.println();
                }
            }
            System.out.println("-------------------------------");
            print(clone);
            System.out.println();
        }

        return clone;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = DataGenerator.generateNumbers(10);
        int[] res = sort(arr);
        // 系统排序
        Arrays.sort(arr);

        boolean right = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != res[i])
                right = false;
        }
        System.out.println(right);
    }
}
