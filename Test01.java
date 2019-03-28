package come.github.couthing;

/**
 * Author:couthing
 * Created:2019/3/4
 */

public class Test01 {
    public static void main(String[] args) {

        //int型出现数据溢出，解决方案：更换数据类型
        int maxvalue = Integer.MAX_VALUE;
        int minvalue = Integer.MIN_VALUE;
        long num = maxvalue + 1;
        //System.out.println(num);
        //System.out.println(minvalue+1);

        //chaer与int型可以互相转换
        //(A--Z) 65--90
        //(a--z) 97--122
        char c='A';
        int number =c+32;
        char x = (char)number; //int转char需要强转
        int y =c;
        //System.out.println(x);
        //System.out.println(y);

        //String中“+”起到链接字符的作用
        String name="couthing";
        String note=" is best!";
        //System.out.println(name+note);
        int numA=10;
        double numB=5.5;
        String result="计算结果："+(numB+numA);
        String result1="计算结果："+numB+numA;
        String result2="a"+2;
        //System.out.println(result);
        //System.out.println(result1);
        //System.out.println(result2);

        //x++和++x的区别
        int a=3;
        int b=7;
        int m=a++; //3
        int n=++b; //8
        //System.out.println(m);
        //System.out.println(n);

        //关系运算符>、<、>=、<=返回类型均为布尔类型
        int q=2;
        int p=3;
        //System.out.println(q>p);
        //System.out.println(q<p);

        //&&短路与  ||短路非
        /*if(1>2&&1<3==true){
            System.out.println("条件满足");
        }else {
            System.out.println("条件不满足");
        }*/

        float f=3.4F;
        double g=3.4;
        System.out.println(f);
        System.out.println(g);

    }
}

