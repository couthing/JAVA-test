/**
 * Author:couthing
 * Created:2019/3/30
 */

public class BubbleSort {

    private static void bubbleSort(int[] array) {
        //外部循环：冒泡次数
        //10个数则循环9次即可
        for (int i = 0; i < array.length; i++) {
            //每次冒泡前，假设数组有序
            boolean sorted = true;
            //内部循环确保较大的数在后面
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    //交换两个数的位置
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    sorted = false;
                }
            }
            if (sorted == true) {
                break;
            }
        }
    }

    public static void arrayPrint(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{
                9, 5, 2, 7, 4, 3, 8, 6, 0, 1
        };
        bubbleSort(array);
        arrayPrint(array);
    }

}
