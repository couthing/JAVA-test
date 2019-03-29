/**
 * Author:couthing
 * Created:2019/3/29
 */

public class Test3Second {

    //this调用本类属性
    /*static class Person {
        private String name;
        private int age;

        public String getPersonInfo(){
            //System.out.println("name：" + this.name + "  "+"age:" + this.age);
            return "name：" + this.name + "  "+"age:" + this.age;
        }*/


        //使用构造方法设置对象属性
        //构造方法(按照升序)
    static class Person {
        private String name;
        private int age;

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
        Person person = new Person("Tom", 777);
        //System.out.println(person.getPersonInfo());
        person.getPersonInfo();
        //匿名对象
        new Person ("Jack",25).getPersonInfo();
        //System.out.println(new Person ("Jack",25).getPersonInfo());
    }
}
