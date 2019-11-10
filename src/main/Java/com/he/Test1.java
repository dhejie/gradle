package com.he;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @ProjectName: gradle
 * @Package: com.he
 * @ClassName: Test1
 * @Author: dhejie
 * @CreateDate: 2019/11/4 22:15
 * @UpdateDate: 2019/11/4 22:15
 * @Version: 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("---------------------");
        for (Integer integer : list) {
            System.out.println(integer);
        }
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        //lambda写法
        list.forEach(u -> {
            System.out.println(u);
        });
    }
}
