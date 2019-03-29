/**
 * Author:couthing
 * Created:2019/3/28
 */
public class Test3First {

    //定义一个person类
    //必须用static修饰，因为new对象时不能从静态上下文引用非静态变量this
    static class Person {

        /*public String name;
        public int age;

        public Person(String name, String gender, int age) {
            this.name = name;
            this.age = age;
        }

        public String getInfo() {
            return "name:" + this.name + "  "+"age:" + this.age;
        }*/


        //让内部操作对外部不可见（对象不能直接操作属性），使用private进行封装
        //编写类是时，类中的所有属性必须用private封装，属性需要被外部访问时，再定义getter setter方法
        //setter方法：主要用于进行属性内容的设置与修改
        //getter方法：主要用于属性内容的取得
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void getPersonInfo() {
            System.out.println("name:" + this.name + "  " + "age:" + this.age);
        }

    }

    public static void main(String[] args) {

        /*Person p1 = new Person("Betty",25);
        System.out.println(p1.age);
        System.out.println(p1.getInfo());*/

        Person p2 = new Person();
        p2.setName("Jack");
        p2.setAge(20);
        p2.getPersonInfo();


    }
}
