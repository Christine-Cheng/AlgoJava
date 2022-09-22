//package com.algo.change;
//
///**
// * @Describe:
// * @Author: HAPPY
// * @Date: 2022-09-16 16:53 星期五
// **/
//public class TestChange {
//
//    public static void main(String[] args) {
//        TestChange u1 = new TestChange("我是谁", "ok", 30,"刘德华");
//        TestChange u2 = new TestChange("我在哪", "no", 20,"郭富城");
//        BeanChangeUtil<TestChange> t = new BeanChangeUtil<>();
//        String str = t.contrastObj(u1, u2);
//        if (str.equals("")) {
//            System.out.println("未有改变");
//        } else {
//            System.out.println(str);
//        }
//    }
//
//    public TestChange() {
//    }
//
//    public TestChange(String about, String lock, Integer age, String name) {
//        this.about = about;
//        this.lock = lock;
//        this.age = age;
//        this.name = name;
//    }
//
//    @PropertyMsg("关于")
//    private String about;
//
//    private String lock;
//
//    @PropertyMsg("年龄")
//    private Integer age;
//
//    @PropertyMsg("姓名")
//    private String name;
//
//    //get... set... 省略
//}
