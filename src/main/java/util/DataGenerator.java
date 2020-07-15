package util;

import java.util.Random;

/**
 * 数据生成器
 */
public class DataGenerator {

    private static final Random random = new Random(47);

    public static int[] generateNumbers(int count){
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = random.nextInt(count);
        }
        return numbers;
    }


    public static void main(String[] args) {
        int[] ints = generateNumbers(20);
        Printer.print(ints);
    }
}
