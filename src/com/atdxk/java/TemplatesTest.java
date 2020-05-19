package com.atdxk.java;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @auther dxk
 * @create 2020-05-19 16:42
 * 1.IDEA 代碼所處的位置：settings-Editor-live Templates / postfix Comletion
 * 2.常用的模板
 */
public class TemplatesTest {
    //模板六：prsf 可生成private static final
//    private static final Customer CUST new Customer();
    //变形：prf
    public static final int NUM = 1;
    //psfs
    public static final String NATION = "china";
    //psfi
    public static final int NUM2 = 100;
    //模板一：psvm
    public static void main(String[] args) {

        //模板2
        System.out.println("hello");
        //变形 soutp /sputm /soutv/ xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplatesTest.main");
        int num1 =10;
        int num2 =20;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println(num1);
        //模板三  fori
        String [] arr = new String[]{"Tom","Jerry","zhangsan","lisi"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形:iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形:itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        //模板四：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        for (Object o : list) {

        }
        //变形 list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }

    }
    public void method(){
        System.out.println("TemplatesTest.method");
        //模板五：ifn
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);

        if (list == null) {
            
        }
        //变形：inn
        if (list != null) {

        }
        //变形：xxx.nn/xxx.null
        if (list == null) {

        }
        if (list != null) {

        }

    }



}
