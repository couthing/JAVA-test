/**
 * Author:couthing
 * Created:2019/3/30
 */

//二分查找
//log2n 时间复杂度O(log(n))
//例子：0 1 2 3 4 5 6 7 8 9  共10个数
public class BinarySearch {

    //左闭右闭 [left,right]
    /*private static  int binarySearch(int[] array, int v) {
        int left = 0;
        int right = array.length - 1;
        //区间内没有数，则停止寻找
        while (left <=right) {
            int m = left + (right - left) / 2;
            if (array[m] == v) {
                return m;
            }else if (array[m] < v) {
                left = m + 1;
            }else if(array[m] > v){
                right = m - 1;
            }
        }
        return -1;
    }*/

    //左闭右开：[left,right)
    public static int binarySearch(int[] array,int v) {
        int left = 0;
        int right = array.length;
        while (left < right) {
            int m=left+(right-left)/2;
            if(array[m]==v){
                return m;
            }else if(array[m]<v){
                left=m+1;
            }else{
                right=m;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array=new int[]{
                0,1,2,3,4,5,6,7,8,9
        };
        int value=100;
        System.out.println(binarySearch(array,value));
    }

}
