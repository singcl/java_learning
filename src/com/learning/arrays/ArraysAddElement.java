package com.learning.arrays;

import java.util.Arrays;

//可以看到Arrays.binarySearch0()方法是利用二分法来查找数据的，最后对于不存在于数组中的数据的下标返回值是return -(low + 1)。
//它对于非数组中的值的返回是这样的：假设该数据存在于数组中，并按照大小顺序排列，此时的low值是假设该数据在数组中的下标
public class ArraysAddElement {
    public static void main(String[] args) throws Exception {
        int array[] = new int[]{ 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
        Arrays.sort(array);
        printArray("数组排序", array);
        int index = Arrays.binarySearch(array, 1);
        System.out.println("元素 1 所在位置（负数为不存在）：" + index);
        int newIndex = -index - 1;
        array = insertElement(array, 1, newIndex);
        printArray("数组添加元素 1", array);

    }

    private static void printArray(String message, int array[]) {
        System.out.println(message
                + ": [length: " + array.length + "]");
        for (int i = 0; i < array.length; i++) {
            if (i != 0){
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }

    private static int[] insertElement(int original[], int element, int index) {
        int length = original.length;
        int dest[] = new int[length + 1];
        System.arraycopy(original, 0, dest, 0, index);
        dest[index] = element;
        System.arraycopy(original, index, dest, index + 1, length - index);
        return dest;
    }
}
