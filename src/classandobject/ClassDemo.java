package classandobject;

public class ClassDemo {
    /*
     * 面向对象
     * 类(模板)
     * 1. 成员变量
     * 2. 成员方法
     * 3. 类成员(静态static)
     *
     * 对象(实例)instance
     */

    String name = null;
    int age;

    //    构造方法
    ClassDemo(String name,int age) {
        this.name  = name;
        this.age = age;
        show();
    }

    void show(){
        System.out.println("姓名:"+ name +" 年龄:"+age);
    }



}
