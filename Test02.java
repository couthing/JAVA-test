package come.github.couthing;

/**
 * Author:couthing
 * Created:2019/3/5
 */

//逻辑控制和方法使用
public class Test02 {
    public static void main(String[] args) {

        //输出等边三角形
        /*int line = 10;
        for(int x=0;x<line;x++){
            for(int y=0;y<line-x;y++){
                System.out.print(" ");
            }
            for(int z=0;z<x;z++){
                System.out.print("* ");
            }
            System.out.println();
        }*/

        //switch范例
        /*System.out.println("请输入字符：");
        char x= 0;
        try {
            x = (char)System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        switch (x){
            case 'a':{
                System.out.println("我是第一！");
            }
            case 'b':{
                System.out.println("我是第二！");
            }
            default:{
                System.out.println("我是第三！");
            }
        }*/


        //打印9*9乘法表
        /*for(int i=1;i<=9;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }*/

        //方法调用与方法重载
        //方法重载的定义：方法名称相同，参数的类型，顺序或个数不同（简称参数列表不同）
        //System.out.println(add(1,2));
        //System.out.println(add(1,2,3));

        //递归（1--100的叠加）
        //System.out.println(sum(100));
        //递归实现60！
        System.out.println(fac(6));

    }

    //方法重载
    /*public static int add(int x,int y){
        return x+y;
    }
    public static int add(int x,int y,int z){
        return x+y+z;
    }*/

    //递归（1--100的叠加）
    /*public static int sum(int num){
        if(num==1){
            return 1;
        }else{
            return num+sum(num-1);
        }
    }*/

    //递归实现6！
    public static int fac(int num){
        if(num==1){
            return 1;
        }else{
            return num*fac(num-1);
        }
    }
}
