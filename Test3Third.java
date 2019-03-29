/**
 * Author:couthing
 * Created:2019/3/29
 */
public class Test3Third {

    /*public static class Person {

        //保存在堆内存中，且每个对象独享属性
        String coutry = "China";
        String name;
        int age;

        public void getPersonInfo() {
            System.out.println("name：" + this.name + "  " + "age:" + this.age+"  "+this.coutry);
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name="Jack";
        person1.age=20;
        person1.getPersonInfo();
        Person person2 = new Person();
        person2.name="Hellon";
        person2.age=7;
        person2.getPersonInfo();*/


    //保存在堆内存中，且每个对象独享属性
    //描述共享属性(如国籍)只需在属性前添加static关键字即可
    //static属性又称为类属性，保存在全局数据区的内存之中，所有对象都可以进行该数据区的访问
    //所有的static方法不允许调用非static定义的属性或方法
    // 所有的非static方法允许访问static方法或属性
    public static class Person {

        static String country = "China";
        String name;
        int age;

        public static void setCoutry(String c) {
            country = c;
        }

        public void getPersonInfo() {
            System.out.println("name：" + this.name + "  " + "age:" + this.age+"  "+this.country);
        }
    }

    public static void main(String[] args) {
        Person person3 = new Person();
        person3.name="Betty";
        person3.age=77;
        person3.getPersonInfo();
        Person person1 = new Person();
        person1.setCoutry("中国");
        person1.name="Jack";
        person1.age=20;
        person1.getPersonInfo();
        Person person2 = new Person();
        Person.setCoutry("中华民国");
        person2.name="Hellon";
        person2.age=7;
        person2.getPersonInfo();

    }
}
