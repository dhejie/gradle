package com.he;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ProjectName: gradle
 * @Package: com.he
 * @ClassName: Test2
 * @Author: dhejie
 * @CreateDate: 2019/11/10 18:33
 * @UpdateDate: 2019/11/10 18:33
 * @Version: 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        TheInterFace li = () -> {
        };
        System.out.println(li.getClass().getInterfaces());;
        //创建一个线程并启动
        new Thread(() -> {
            System.out.println("这是一个线程----111");
            System.out.println("这是一个线程----222");}).start();
        List<String> list2=new ArrayList<>();
        List<String> list= Arrays.asList("hello word","hello","word");
        list.forEach(item->list2.add(item.toUpperCase()));
        list2.forEach(item-> System.out.println(item));
        //stream流的简单操作
        list.stream().map(item->item.toUpperCase()).forEach(item-> System.out.println(item+"---"));
//        list.stream().map(String::toUpperCase).forEach(item-> System.out.println(item+"+++++"));
        list.stream().map(String::toUpperCase).forEach(item-> list2.add(item+"+++"));
        list2.forEach(item->{
            System.out.println(item);
        });
    }

}

@FunctionalInterface
interface TheInterFace {
    void method();
}
//函数式接口注解一个接口只能有一个抽象方法
@FunctionalInterface
interface TheInterFace2 {
    void method2();
//    void method2();
}