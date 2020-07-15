package selection_sorter;

import util.DataGenerator;
import util.Printer;

import java.util.Arrays;

import static util.Printer.print;

/**
 *  选择排序
 *  思想: 每一次找到 最小值/最大值 的下标，然后从前向后进行置换
 *  时间复杂度 ：O(n²)
 *  空间复杂度（额外空间）：O(1)
 *
 *  不稳定，两个相同值，在排序可能产生位置调换问题
 */
public class SelectionSorter {

    /**
     *  从小到大排序
     * @param array
     * @return
     */
    public static int[] sort(int[] array){
        int[] clone = array.clone();
        for (int i = 0; i < clone.length; i++) {
            int minPos = i;
            for (int j = i+1; j < clone.length; j++) {
                minPos = clone[minPos] > clone[j] ? j:minPos;
            }
            swap(clone, i, minPos);
        }
        return clone;
    }


    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = DataGenerator.generateNumbers(10000);
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
