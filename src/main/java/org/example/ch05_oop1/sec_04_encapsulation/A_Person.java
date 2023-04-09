package org.example.ch05_oop1.sec_04_encapsulation;

public class A_Person {
    // 使用private修饰成员变量，将这些成员变量隐藏起来
    private String name;
    private int age;

    // 提供方法来操作name成员变量
    public void setName(String name) {
        // 执行合理性校验，要求用户名必须在2~6为之间
        if (name.length() > 6 || name.length() < 2) {
            System.out.println("您设置的人名不符合要求");
            return;
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return this.name;
    }

    // 提供方法操作age成员变量
    public void setAge(int age) {
        // 执行合理性校验，要求用户年龄必须在1~100之间
        if (age > 100 || age < 0) {
            System.out.println("您设置的年龄不合法");
            return;
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }

}
