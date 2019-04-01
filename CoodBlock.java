/**
 * Author:couthing
 * Created:2019/4/1
 */
public class CoodBlock {

    //定义在主类中的代码块
    //执行顺序：构造块 -> 静态构造块 ->构造方法  （与对象个数有关）
    /*{
        System.out.println("1.CodeBlock的构造块");
    }

    {
        System.out.println("2.CodeBlock的静态构造块");
    }

    public CoodBlock(){
        System.out.println("3.CoodBlock的构造方法");
    }*/


    //非主类
    //执行顺序：静态块(执行一次) -> 构造方法 -> 构造块
    static class Person{
        static {
            System.out.println("3.Person类的静态块");
        }

        {
            System.out.println("1.Person类的构造块");
        }

        public Person(){
            System.out.println("2.Person类的构造方法");
        }

    }


    public static void main(String[] args) {
        System.out.println("-------start-------");

        /*new CoodBlock();
        new CoodBlock();*/
        //-------start-------
        //1.CodeBlock的构造块
        //2.CodeBlock的静态构造块
        //3.CoodBlock的构造方法
        //1.CodeBlock的构造块
        //2.CodeBlock的静态构造块
        //3.CoodBlock的构造方法
        //-------end-------

        /*new Person();
        new Person();*/
        //-------start-------
        //3.Person类的静态块
        //1.Person类的构造块
        //2.Person类的构造方法
        //1.Person类的构造块
        //2.Person类的构造方法
        //-------end-------
        
        System.out.println("-------end-------");

    }
}
