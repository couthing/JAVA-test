package come.github.couthing;

/**
 * Author:couthing
 * Created:2019/3/23
 */
public class ArrayTest {

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void getInfo() {
            System.out.println("name: " + this.name + "  " + "age: " + this.age);
        }
    }

    public static void main(String[] args) {

        //初始化（静态）
        /*Person[] per = new Person[]{
                new Person("张三", 3),
                new Person("李四", 4)
        };
        for(int i=0;i<per.length;i++){
            per[i].getInfo();
        }
    }*/

        //初始化（动态）
        Person[] per = new Person[2];
        per[0] = new Person("jack", 5);
        per[1] = new Person("tom", 6);
        for (int i = 0; i < per.length; i++) {
            per[i].getInfo();
        }


        //数据统计
        /*int[] array = new int[]{7, 6, 8, 9, 4, 2};
        dataStatistics(array);
    }
    public static void dataStatistics(int[] temp) {
        int max = temp[0];
        int min = temp[0];
        int sum = 0;
        double average = 0;
        for (int i = 0; i < temp.length; i++) {
            sum = sum + temp[i];
            if (max < temp[i]) {
                max = temp[i];
            }
            if (min > temp[i]) {
                min = temp[i];
            }
            average = sum / temp.length;
        }
        System.out.println("最大值为：" + max);
        System.out.println("最小值为：" + min);
        System.out.println("和为：" + sum);
        System.out.println("平均值为：" + average);
    }*/


        //数组拷贝
        //System.arraycopy(源数组名称，源数组开始点，目标数组名称，目标数组开始点，拷贝长度)
        /*int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array2 = new int[]{11, 22, 33, 44, 55, 66, 77, 88, 99};
        System.arraycopy(array2, 4, array1, 1, 3);
        printArray(array1);
    }

    public static void printArray(int[] temp) {
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
    }*/


        //数组排序 (int型 char型)
        /*int[] array1 = new int[]{1, 7, 5, 9, 4};
        char[] array2 = new char[]{'a', 'q', 'z', 'b'};
        Arrays.sort(array1);
        Arrays.sort(array2);
        printArray(array1);
        printArray(array2);
    }

    public static void printArray(int[] temp) {
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
        System.out.println();
    }

    public static void printArray(char[] temp) {
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
        System.out.println();
    }*/


        //数组与方法互操作（重点）
        //方法修改数组 将数组中的每个元素扩大7倍并输出
        /*int[] array = init();
        bigger(array);
        printArray(array);
    }
    public static int[] init() {
        return new int[]{1, 2, 3};
    }

    public static void bigger(int[] temp) {
        for (int i = 0; i < temp.length; i++) {
            temp[i] = 7 * temp[i];
        }
    }

    public static void printArray(int[] temp) {
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
    }*/


        //方法返回数组 (1 2 3 4)
        /*int[] array = init();
        printArray(array);
    }

   public static int[] init(){
        return new int[]{1,2,3,4};
    }

    public static void printArray(int[] temp) {
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }*/


        //方法接收数组 (1 2 3 4 5)
        /*int[] array = new int[]{1, 2, 3, 4, 5}; //数组的初始化
        printArray(array);  //调用方法
    }
        public static void printArray(int [] temp){
            for(int i=0;i<temp.length;i++){
                System.out.println(temp[i]);
            }
        }*/


        //静态初始化数组
        /*int []array=new int[]{1,2,3};
        for(int a:array){
            System.out.println(a);
        }
        //匿名数组
        ???
        System.out.println(new int []{1,2,3});  //?[I@1540e19d
        System.out.println(new int []{1,2,3}.length);*/

        //多个栈内存指向相同的堆内存
        /*int[] array=null;
        int[] temp=null;
        //数组属于引用数据类型，在使用前要先初始化，否则会出现空指针异常
        //System.out.println(array.length);
        array=new int[3];
        array[0]=11;
        array[1]=12;
        array[2]=13;
        System.out.println("array的长度为"+array.length);
        System.out.print("数组的值为：");
        for(int i=0;i<array.length;i++){
            System.out.print(+array[i]+" ");
        }
        System.out.println();
        temp=array;
        temp[0]=50;
        System.out.println("array[0]的值为："+array[0]);
        System.out.println("temp[0]的值为："+temp[0]);*/


        //数组的初始化及打印
        /*int []array = new int [3];
        System.out.println("数组的长度为："+array.length);
        array[0]=1;
        array[1]=2;
        array[2]=3;
        for(int a:array){
            System.out.print(a+" ");
        }*/

    }
}

