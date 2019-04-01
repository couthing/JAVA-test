/**
 * Author:couthing
 * Created:2019/3/29
 */

public class Test3Second {

    //this调用本类属性
    /*static class Person {

    //无构造方法，系统自动生成一个无参构造方法
    // public Person(){}
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
            System.out.println("name：" + name + "  " + "age:" + age);
        }
    }*/



    static class Person {
        private String name;
        private int age;

        //构造方法设置对象属性
        // 1) 构造方法名称必须与类名称相同构造方法没有返回值声明
        // 2) 每一个类中至少存在一个构造方法
        // 2) 没有明确定义则系统自动生成一个无参构造
        // 编译器根据程序结构区分普通方法和构造方法，所以在构造方法之前没有返回值声明
        public Person(int i){
            setAge(i);
        }

        public Person(String n, int i) {
            name = n;
            setAge(i);
        }

        public void setName(String n) {
            name = n;
        }

        public String getName() {
            return name;
        }

        public void setAge(int i) {
            if (i > 0 && i <= 200) {
                age = i;
            } else {
                System.out.println("请输入符合实际的年龄！");
            }
        }

        public int getAge() {
            return age;
        }

        public void getPersonInfo() {
            System.out.println("name：" + name + "  "+"age:" + age);
        }
    }

        public static void main(String[] args) {
            /*Person p3 = new Person();
            p3.setName("Tom");
            p3.setAge(23);
            p3.getPersonInfo();*/

            Person p5=new Person("Tom",24);
            p5.getPersonInfo();
            new Person("Jack", 25).getPersonInfo();
            //只有一个参数的构造方法
            Person p6=new Person(15);
            p6.getPersonInfo();
        }

}
